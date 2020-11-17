package io;

import java.io.*;

//Write a Java program to read contents from a file into byte array.
public class Ex_8 {
    public static void main(String[] args) {
        String file_name = "/home/students/test.txt";
        InputStream fins = null;
        try{
            fins = new FileInputStream(file_name);
            byte file_count[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_count))>0){
                System.out.println(new String(file_count,0,read_count-1));
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fins != null) {
                try {
                    fins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
