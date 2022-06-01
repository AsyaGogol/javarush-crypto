package ua.com.javarush.cryptoanalyser;


import ua.com.javarush.cryptoanalyser.ceasarCipher.*;
import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Это шифр Цезаря. \n Если вы хотите зашифровать текст, нажмите 1. \n" +
                "Если вы хотите расшифровать текст и вам известен ключ, нажмите 2 \n" +
                "Для расшифроки Brute Force - нажмите 3\n");
        Scanner scanner = new Scanner(System.in);

        String choice = scanner.nextLine();
        String inputFile = scanner.nextLine();
        String outputFile = scanner.nextLine();
        int key = scanner.nextInt();

        if ("1".contains(choice)) {
            Encryption.encryption(inputFile, outputFile, key);
        }

        if ("2".contains(choice)) {
            Decoding.decoding(inputFile, outputFile, key);
        }

        if ("3".contains(choice)) {
            BruteForce.bruteForce(inputFile);
        }

        scanner.close();
    }
}


