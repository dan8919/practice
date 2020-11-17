package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_11 {
    public static void main(String[] args) {
//        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        String str_data = "";

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/home/students/test.txt"));
            while(strLine != null){
                if(strLine == null)break;
                str_data += strLine;
                strLine = bufferedReader.readLine();
                System.out.println(str_data);
                System.out.println("<<<<<<<<<<<<<<<<<<<<");
            }
            System.out.println(str_data);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("unable to read the file");
        }


    }
}
