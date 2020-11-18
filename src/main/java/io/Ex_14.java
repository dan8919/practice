package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a Java program to find the longest word in a text file.
public class Ex_14 {
    public static void main(String[] args) throws FileNotFoundException {
        new Ex_14().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {
        String longest_word = "";
        String current;
        //파일을 스캔
        Scanner scanner = new Scanner(new File("/home/students/test.txt"));

        while(scanner.hasNext()){
            current = scanner.next();
            if(current.length() > longest_word.length() ){
                longest_word = current;
            }
        }
        System.out.println("\n" + longest_word + "\n");
        return longest_word;
    }

}
