package io;

import java.io.File;

public class GetListOfAllName {
    public static void main(String[] args) {
        File file = new File("/home/students/");
        getDownloadsOfAllName();

        String[] fileList = file.list();
        for (String name:fileList){
            System.out.println(name);
        }
    }

    public static void getDownloadsOfAllName() {
        String filePath = "/Users/pharos/Downloads";
        File file2 = new File(filePath);
        String[] fileList2 = file2.list();
        for (String name:fileList2){
            System.out.println(name);
        }
    }
}






















































