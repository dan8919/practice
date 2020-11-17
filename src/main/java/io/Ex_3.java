package io;

import java.io.File;

//Write a Java program to check
// if a file or directory specified by pathname exists or not.
public class Ex_3 {
    public static void main(String[] args) {
        File myfile_dir = new File("/home/students/xyz.txt");
        if(myfile_dir.exists())
        {
            System.out.println("The directory or file exixts.\n");
        }else
        {
            System.out.println("The directory or file not exixts.\n");
        }
    }
}
