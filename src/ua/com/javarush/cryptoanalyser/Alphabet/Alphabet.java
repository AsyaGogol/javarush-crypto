package ua.com.javarush.cryptoanalyser.Alphabet;

import java.util.Arrays;

public class Alphabet {
    private static final char[] ALPHABET = { 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к',
            'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы',
            'ь', 'э', 'ю', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' ','А', 'Б', 'В', 'Г',
            'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У',
            'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Э', 'Ю', 'Я', '\n'};


    public static int length(){
        return ALPHABET.length;
    }

    public static char[] get(){
        return ALPHABET;
    }


    public static int IndexOfSymbolInAlphabet (char[]alphabet, char symbol){
        Arrays.sort(alphabet);
        int startIndex = 0;
        int endIndex = alphabet.length-1;
        int middleIndex;
        while (startIndex<=endIndex){
            middleIndex = startIndex +(endIndex - startIndex) /2;

            if(alphabet[middleIndex] == symbol){
                return middleIndex;
            }
            if(alphabet[middleIndex]>symbol){
                endIndex = middleIndex-1;
            }else{
                startIndex = middleIndex +1;
            }
        }
        return -1;
    }
}
