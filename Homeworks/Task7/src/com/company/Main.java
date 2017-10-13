package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Creator creator = new Creator();
        System.out.println("Введите символ");
        String string = scanner.nextLine();
        char ch = string.charAt(0);
        boolean[] results = {creator.isDigit(ch), creator.isLetter(ch), creator.isUpper(ch), creator.isLower(ch)};
        System.out.print("Это ");
        if (results[0] == true) {
            System.out.print("цифра.");
        } else if (results[1] == true && results[2] == true) {
            System.out.print("заглавная буква.");
        } else if (results[1] == true && results[3] == true) {
            System.out.print("строчная буква.");
        }


    }
}
