package ua.com.javarush.cryptoanalyser.ceasarCipher;

import ua.com.javarush.cryptoanalyser.Alphabet.Alphabet;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class BruteForce {

    public static void bruteForce(String inputFilePath) throws IOException {
        Path inputPath = Paths.get(inputFilePath);
        Path newDirectory = Path.of(inputPath.getParent().toString());


        for (int key = 1; key < Alphabet.length(); key++) {

            String fileName = "Вариант ключа-" + key + ".txt";

            Path outputFile = Files.createFile(Path.of(newDirectory.toString(), fileName));
            Encryption.encryption(inputFilePath, String.valueOf(outputFile), key);

        }
    }
}










