package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program to read a file content line by line.
public class Ex_9 {
    public static void main(String[] args) {
        BufferedReader br = null;
        String strLine = "";

        try {
            br = new BufferedReader(new FileReader("/home/students/test.txt"));
            while((strLine = br.readLine()) != null){
                System.out.println(strLine);
                System.out.println("<<<<<<<<<<<<<<<<<<<<");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to read the file");
        }
    }
}
