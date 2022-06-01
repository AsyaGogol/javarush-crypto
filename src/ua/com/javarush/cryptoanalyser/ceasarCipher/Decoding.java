package ua.com.javarush.cryptoanalyser.ceasarCipher;

import ua.com.javarush.cryptoanalyser.Alphabet.Alphabet;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Decoding {

    public static void decoding(String inputFilePath, String outputFilePath, int key) throws IOException {

        Path inputPath = Paths.get(inputFilePath);
        Path outputPath = Paths.get(outputFilePath);

        try (BufferedReader bufferReader = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8);
             BufferedWriter bufferWriter = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {

            while (bufferReader.ready()) {

                char symbol = (char) bufferReader.read();

                int newIndex = (Alphabet.IndexOfSymbolInAlphabet(Alphabet.get(), symbol) - key) >= 0 ?
                        (Alphabet.IndexOfSymbolInAlphabet(Alphabet.get(), symbol) - key) :
                        (Alphabet.length() + (Alphabet.IndexOfSymbolInAlphabet(Alphabet.get(), symbol)) - key);

                String decodingText = String.valueOf(Alphabet.get()[newIndex]);

                bufferWriter.write(decodingText);
            }

        } catch (IOException e) {

        }
    }
}





