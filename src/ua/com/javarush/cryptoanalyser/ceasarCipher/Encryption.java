package ua.com.javarush.cryptoanalyser.ceasarCipher;

import ua.com.javarush.cryptoanalyser.Alphabet.Alphabet;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static ua.com.javarush.cryptoanalyser.Alphabet.Alphabet.*;

public class Encryption {
    public static void encryption(String inputFilePath, String outputFilePath, int key) throws IOException {
        Path inputPath = Paths.get(inputFilePath);
        Path outputPath = Paths.get(outputFilePath);

        try (BufferedReader bufferReader = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8);
             BufferedWriter bufferWriter = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {

            while (bufferReader.ready()) {
                char symbol = (char) bufferReader.read();

                if (IndexOfSymbolInAlphabet(Alphabet.get(), symbol) == -1) {
                    continue;
                }

                String encodeText = String.valueOf(Alphabet.get()[(IndexOfSymbolInAlphabet(Alphabet.get(), symbol)
                        + key) % Alphabet.length()]);

                bufferWriter.write(encodeText);
            }

        }  catch (IOException e){

        }
    }
}

