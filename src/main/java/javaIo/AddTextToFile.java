package javaIo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class AddTextToFile {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\intel\\Desktop\\File.txt");
        String text = " Whats up?";
        Files.writeString(path,text, StandardOpenOption.APPEND);
    }
}
