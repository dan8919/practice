package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program to read a plain text file.
public class Ex_10 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
