package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomStringMatch {

    public static void main(String[] args) {
        final int capa=100000;
        List<String> list= RandomStringMatch.getRandomList(capa);
        usePatternCompile(list);
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        useMatches(list);
    }

   public static String getRandomString() {
       StringBuffer sb = new StringBuffer();
       Random rand = new Random();
       for (int i=0; i<10;i++){
           int index = rand.nextInt(3) ;
       switch (index){
           case 0:
               sb.append((char)(rand.nextInt(26)+97));
               break;
           case 1:
               sb.append((char)(rand.nextInt(26)+65));
               break;
           case 2:
               sb.append(rand.nextInt(10));
               break;
       }
       }
        return sb.toString();
   }

   public static List<String> getRandomList (int capa){
       List<String> randomList = new ArrayList<>(capa);

       for(int i=0; i<capa;i++) {
           randomList.add(RandomStringMatch.getRandomString());
       }

       return  randomList;
   }

    public static void useMatches(List<String> list) {
        long start2 = System.currentTimeMillis();
        String pattern = "ab.";
        for(String randomString:list){
            randomString.matches(pattern);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("match 실행시간:"+(end2-start2));
        }

    public static void usePatternCompile(List<String> list) {
        long start1 = System.currentTimeMillis();
        Pattern pattern=Pattern.compile("ab.");
        for(String randomString:list){
            Matcher matcher = pattern.matcher(randomString);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("pattern compile후 실행시간:"+(end1-start1));
    }

}
