package java8feature;

import java.util.Arrays;

public class MethodReference {
    public static void main(String[] args) {
        String[] strArray = {"abe","adb","deb","abc","ghi","acd","acg","acb"};
        Arrays.sort(strArray,String::compareToIgnoreCase);
        for(String str:strArray){
            System.out.println(str +" ");
        }
    }
}
