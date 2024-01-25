package com.sabrina.module2;

import java.util.List;

    /**
     * A class that represents an object that supports reading of contents one line at a time
     *
     * @author Sabrina Hafezi
     * @version 1
     */
    public class RowsReader {

        private List<List<String>> rows;
        private int currentRow;

        /**
         * @param rows The content to be read
         */
        public RowsReader(List<List<String>> rows){
            this.rows = rows;
            this.currentRow = 0;
        }

        /**
         * @return The next line to be read. If all the lines were read, returns null.
         */
        public List<String> getRow(){
            if(arrivedToEnd()){
                return null;
            }
            return rows.get(currentRow++);
        }

        /**
         * @return true of all the lines were read, false otherwise
         */
        public boolean arrivedToEnd(){
            return currentRow >= rows.size();
        }

    }