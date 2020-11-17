package io;

import java.io.File;
import java.util.Date;

//Write a Java program to get last modified time of a file.
public class Ex_6 {
    public static void main(String[] args) {
        File file = new File("/home/students/xyz.txt");
        Date date = new Date(file.lastModified());

        System.out.println("\nThe file was last modified on:" + date +"\n");
    }
}
