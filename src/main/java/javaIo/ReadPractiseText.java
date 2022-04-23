package javaIo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPractiseText {
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("E:\\My Documents\\Maktab\\Maktab homeworks\\List.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}