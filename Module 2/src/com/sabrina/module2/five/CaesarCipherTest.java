package com.sabrina.module2.five;

public class CaesarCipherTest {
    public static void main(String[] args) {
        EnglishCaesarCipher ecc = new EnglishCaesarCipher(4);
        System.out.println(ecc.cipherText("abcd"));
        System.out.println(ecc.decipherText("cdef"));

        String message = "good morning";
        String cipheredMessage = ecc.cipherText(message);
        EnglishCaesarCipherCracker cracker = new EnglishCaesarCipherCracker("/Users/sabrina/IdeaProjects/Module 2/src/com/sabrina/module2/five/words_alpha");
        int key = cracker.crackShiftOfMessage(cipheredMessage);
        System.out.println("The key is "+key);
    }
}