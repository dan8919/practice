package io;

import java.io.*;

//Write a Java program to read first 3 lines from a file.
public class Ex_13 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";

        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("/home/students/test.txt")) ;
            while(((strLine = lineNumberReader.readLine()) !=  null) && lineNumberReader.getLineNumber()<=3){
                System.out.println(strLine);
            }
            lineNumberReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
