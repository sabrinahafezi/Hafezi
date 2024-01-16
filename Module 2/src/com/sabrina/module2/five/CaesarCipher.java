package com.sabrina.module2.five;

import java.util.HashMap;

/**
 * An abstract class that represents a Caesar cipher coder and decoder. Inheriting classes need to provide the
 * alphabet.
 * @author Sabrina
 * @version 1
 */
public abstract class CaesarCipher {

    private String[][] alphabet;
    private HashMap<String, String> cipherMap;
    private HashMap<String, String> decipherMap;

    /**
     * @return the character sets for the alphabet (e.g, upper and lower case).
     */
    protected abstract String[][] getAlphabet();

    public CaesarCipher(int step){
        this.cipherMap = new HashMap<String, String>();
        this.decipherMap = new HashMap<String, String>();
        this.alphabet = getAlphabet();
        if(step < 1 || step > this.alphabet[0].length-1){
            throw new IllegalArgumentException("Step must be between 1 and "+(this.alphabet.length-1));
        }

        for(int i=0;i<alphabet.length; i++){
            String[] characterSet = alphabet[i];
            for(int j=0;j<characterSet.length;j++){
                String source = characterSet[j];
                String encrypted = characterSet[(j+step) % characterSet.length];
                cipherMap.put(source, encrypted);
                decipherMap.put(encrypted, source);
            }
        }
    }

    public String cipherText(String text){
        return mapString(text, cipherMap);
    }

    public String decipherText(String text){
        return mapString(text, decipherMap);
    }

    private String mapString(String value, HashMap<String, String> map){
        StringBuilder sb = new StringBuilder();
        for(String s : value.split("")){
            if(map.containsKey(s)){
                sb.append(map.get(s));
            }
            else{
                sb.append(s);
            }
        }
        return sb.toString();
    }
}