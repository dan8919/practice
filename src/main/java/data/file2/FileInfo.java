package data.file2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileInfo {

    public static void main(String[] args) throws IOException {
        String dir = "C:" + File.separator + "Users" + File.separator + "pharos" + File.separator + "Downloads";
        String detailsURI = "C:" + File.separator + "Users" + File.separator + "pharos" + File.separator +"details.txt";

        File directory = new File(dir);
        File details = new File(detailsURI);

        BufferedWriter writer = new BufferedWriter(new FileWriter(details));

        recursive(directory,writer);

         writer.close();
    }



    private static void recursive(File f,BufferedWriter writer)  {
        long lsize = 0;
        String name;
        Path path;

        if(f.isDirectory()){
            File[] listFiles1= f.listFiles();
            for (File f1:listFiles1){
                name= f1.getName();
                path = f1.toPath();
                try {
                      lsize = Files.size(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                String size = Long.toString(lsize);
                System.out.println(name);
                System.out.println(path);
                System.out.println(size);

                try{
                    writer.write(name + ":  ");
                    writer.write(size + "\n");
                }catch (IOException e){
                    e.printStackTrace();
                }

                recursive(f1,writer);
            }
        }

    }

}