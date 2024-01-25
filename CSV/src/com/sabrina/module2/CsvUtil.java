package com.sabrina.module2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CsvUtil {

    /**
     * @param filePath The csv file path to be written
     * @param rows The content to be written
     * @throws IOException
     */
    public static void writeCSVFile(String filePath, List<List<String>> rows) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (List<String> row : rows) {
            for (int i = 0; i < row.size(); i++) {
                sb.append(row.get(i));
                if (i == row.size() - 1) { // last entry in a row
                    sb.append("\n");
                } else {
                    sb.append(",");
                }
            }
        }
        Files.writeString(Path.of(filePath), sb);
    }

    /**
     * @param filePath The file to be read
     * @return The contents of the csv file
     * @throws IOException
     */
    public static List<List<String>> readCsvFile(String filePath) throws IOException {
        List<List<String>> content = new ArrayList<List<String>>();
        for (String line : Files.readAllLines(Path.of(filePath))) {
            List<String> row = List.of(line.split(","));
            content.add(row);
        }
        return content;
    }


    /**
     * @param filePath The file to be read
     * @return A RowsReader that can read line by line of the file
     * @throws IOException
     */
    public static RowsReader getRowsReaderOfCsvFile(String filePath) throws IOException {
        List<List<String>> content = readCsvFile(filePath);
        return new RowsReader(content);
    }
}