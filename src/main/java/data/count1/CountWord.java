package data.count1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWord {
    public static void main(String[] args) throws IOException {
        String fileURI = "C:" + File.separator + "Users" + File.separator + "pharos" + File.separator + "test.txt";
        File file = new File(fileURI);
        Path filePath = file.toPath();
        List<String> strings = Files.readAllLines(filePath);

        Pattern pattern =  Pattern.compile("a.");

//        "(\s|\n)+$"

        for (String s:strings){
          Matcher matcher = pattern.matcher(s);
//            System.out.println(matcher);
        }

    }
}
