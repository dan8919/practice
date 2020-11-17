package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Write Java program to read input from java console.
//
//Test Data
//Input your name: Alexandra
public class Ex_7 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("Input your name:");
        String name = bufferedReader.readLine();
        System.out.println("Your name is:" +name);
    }
}
