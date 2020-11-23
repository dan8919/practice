package array;

import java.util.Arrays;
import java.util.HashSet;

//find the common elements between two arrays (string values).
public class Ex_8 {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};

        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.println("array1:"+ Arrays.toString(array1));
        System.out.println("array2:"+ Arrays.toString(array2));

        HashSet<String> set = new HashSet<>();
        int len1 = array1.length;
        int len2 = array2.length;

        for(int i = 0 ; i < len1 ; i++){
            String array1_string = array1[i];
            for(int j = 0; j<len2; j++){
              if (array1_string.equals(array2[j])){
                  set.add(array1_string);
              };
            }
        }
        System.out.println(set);
    }
}
