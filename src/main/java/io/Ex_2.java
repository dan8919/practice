package io;

import java.io.File;
import java.io.FilenameFilter;

//Write a Java program to get specific files by extensions from
// a specified folder.
public class Ex_2 {
    public static void main(String[] args) {
        File file = new File("/home/students/");
        //return  true/false
        String[] list =file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".py")){
                    return true;
                }else {
                    return false;
                }
            }
        });

        file.list();

        for (String f:list){
            System.out.println(f);
        }
    }
}
