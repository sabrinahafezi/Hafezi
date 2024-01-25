package com.sabrina.module2;

import java.io.IOException;
import java.util.List;

public class Main {

    /**
     * Exists solely for testing purposes. The actual library would not have this class and uses tests instead.
     */
    public static void main(String[] args) {
        List<List<String>> content = List.of(
                List.of("Name", "Occupation", "Age"),
                List.of("Zaremba", "Teacher", "39"),
                List.of("John", "Teacher", "30"),
                List.of("Sabrina", "Student", "17")
        );
        try {
            CsvUtil.writeCSVFile("content.csv", content);
            RowsReader rr = CsvUtil.getRowsReaderOfCsvFile("content.csv");
            System.out.println("1: " + rr.getRow());
            System.out.println("2: " + rr.getRow());
            System.out.println("3: " + rr.getRow());
            System.out.println("4: " + rr.getRow());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}