package data.file1;

import java.io.*;
import java.util.zip.GZIPInputStream;
public class FindFile {

    public static void main(String[] args) throws IOException {
        String fileName = "simplelogger.properties.gz";
        String dir = "C:" + File.separator + "Users" + File.separator + "pharos" + File.separator + "Downloads";
        String pathName = dir + File.separator + fileName;
        File gzipFile = new File(pathName);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (new GZIPInputStream(new FileInputStream(gzipFile))));

        String makeNewFile = dir + File.separator +  "application.properties";
//fileWriter에  writen없음. PrintWriter로 대체
        PrintWriter fileWriter = new PrintWriter(new File(makeNewFile));

        try{
            String fileString = "simplelogger.properties";

            fileWriter.println(fileString);
            while ((fileString = bufferedReader.readLine())!= null){
                fileWriter.println(fileString);
            }
            fileWriter.close();

        } catch(IOException e){
            e.printStackTrace();
        }


    }
}
