package data.file2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileInfo {
    public static void main(String[] args) throws IOException {
        String dir = "C:" + File.separator + "Users" + File.separator + "pharos" + File.separator + "Downloads";
        File directory = new File(dir);

       File[] listFiles = directory.listFiles();
       String dirName = directory.getName();

//        File recording = new File();

       for (File f:listFiles){
          String name= f.getName();
           Path path = f.toPath();
           Long size = Files.size(path);

           System.out.println(name);
           System.out.println(path);
           System.out.println(size);
       }



    }

}
