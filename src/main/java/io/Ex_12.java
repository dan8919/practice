package io;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

//Write a Java program to write and read a plain text file.
public class Ex_12 {
    public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();
    String strLine = "";
    String filename = "/home/students/test.txt";

        try {
            //boolean append : True 면 파일의 끝에 출력 데이터를 붙이며, False면 파일에 덮어쓴다.
            FileWriter fw = new FileWriter(filename,false);
            fw.write("Java Exercises\n");
            fw.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
           while (strLine != null){
               stringBuilder.append(strLine);
               stringBuilder.append(System.lineSeparator());
               strLine = bufferedReader.readLine();
               System.out.println(strLine);
           }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("IOExeception:"+ e.getMessage());
        }

    }
}


