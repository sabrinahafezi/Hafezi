package com.sabrina.module2.five;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class EnglishCaesarCipherCracker {

    private HashSet<String> dictionary;

    public EnglishCaesarCipherCracker(String wordsFileLocation){
        dictionary = new HashSet<String>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(wordsFileLocation));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Provided words file cannot be found");
        }
        while (scanner.hasNext()) {
            String word = scanner.next();
            dictionary.add(word);
        }
        scanner.close();
    }

    public int crackShiftOfMessage(String message){
        if(message == null || message == ""){
            return -1;
        }
        String fixedMessage = message.replaceAll("[^a-zA-Z]", " "); // keeping only letters
        String[] wordsInMessage = fixedMessage.split(" ");
        for(int currentKey=1; currentKey<26;currentKey++){
            EnglishCaesarCipher ecc = new EnglishCaesarCipher(currentKey);
            boolean allWordsFound = true;
            for(String word : wordsInMessage){
                if(dictionary.contains(ecc.decipherText(word))){
                    continue;
                }
                allWordsFound = false;
                break;
            }
            if(allWordsFound){
                return currentKey;
            }
        }
        return -1;
    }
}