package javaIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLinesAndSaveInVariable {
    public static void main(String[] args) {
        BufferedReader reader;
        List<String> linesOfFile = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader("E:\\My Documents\\Maktab\\Maktab homeworks\\List.txt"));
            String line = reader.readLine();
            while (line != null) {
                linesOfFile.add(line);
                line = reader.readLine();
            }
            for (String l:linesOfFile) {
                System.out.println(l);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
