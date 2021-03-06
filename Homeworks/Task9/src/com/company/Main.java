package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int ages[] = new int[100];
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Draqneel\\Desktop\\JAVA_IT_PARK_4\\Homeworks\\Task9\\src\\com\\company\\file.txt"));
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException();
        }
        String line;
        int age = 0;
        int scraper;
        char symbol;
        int multiplicator = 1;

        try {
            while ((line = reader.readLine()) != null) {
                scraper = line.length() - 1;
                while (line.charAt(scraper) != 32){
                   symbol = line.charAt(scraper);
                   age +=((int)symbol - 48)*multiplicator;
                   multiplicator = multiplicator * 10;
                   scraper--;
                }
                ages[age]++;
                age = 0;
                multiplicator = 1;

            }
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }

        for (int i=0; i<ages.length; i++){
            if (ages[i] != 0){
                System.out.println("Людей с возрастом "+i+" всего "+ages[i]);
            }

        }
    }
}
