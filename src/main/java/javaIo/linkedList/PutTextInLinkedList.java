package javaIo.linkedList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class PutTextInLinkedList {
    public static void main(String[] args) {
        BufferedReader reader;
        LinkedList<String> lines = new LinkedList<>();
        try {
            reader = new BufferedReader(new FileReader("E:\\My Documents\\Maktab\\Maktab homeworks\\List.txt"));
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.reverse(lines);
        int i = 1;
        for (String s :lines) {
            System.out.println(i + " " + s);
            i++;
        }
    }
}
