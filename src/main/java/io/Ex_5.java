package io;
//Write a Java program to compare two files lexicographically.
//
//According to Wikipedia:
//In mathematics, the lexicographic or lexicographical order
// (also known as lexical order, dictionary order, alphabetical
// order or lexicographic(al) product) is a generalization of the way
// the alphabetical order of words is based on the alphabetical order of
// their component letters. This generalization consists primarily in
// defining a total order over the sequences (often called words in computer
// science) of elements of a finite totally ordered set, often called
// alphabet.
public class Ex_5 {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "12345";
        String str3 = "Java examples";

        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        int var2 = str1.compareTo( str3 );
        System.out.println("str1 & str3 comparison: "+var2);
    }
}
