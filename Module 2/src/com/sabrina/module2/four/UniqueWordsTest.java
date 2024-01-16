package com.sabrina.module2.four;


public class UniqueWordsTest {
    public static void main(String[] args) {
        CountUniqueWords uwc = new CountUniqueWords("/Users/sabrina/IdeaProjects/Module 2/src/com/sabrina/module2/four/illiad");
        System.out.println("The number of unique words is "+uwc.getNumOfWords());
    }
}
