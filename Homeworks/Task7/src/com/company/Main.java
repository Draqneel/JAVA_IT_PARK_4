package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Creator creator = new Creator();
        char[] glue = new char[100];
        String string;
        char ch;

        while (true) {
            System.out.println("1) Проверка символа");
            System.out.println("2) Склеивание строки");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите символ");
                    string = scanner.next();
                    ch = string.charAt(0);
                    creator.setACode(ch);
                    boolean[] results = {creator.isDigit(ch), creator.isLetter(ch), creator.isUpper(ch), creator.isLower(ch)};
                    System.out.print("Это ");
                    if (results[0] == true) {
                        System.out.print("цифра.");
                    } else if (results[1] == true && results[2] == true) {
                        System.out.println("заглавная буква.");
                    } else if (results[1] == true && results[3] == true) {
                        System.out.println("строчная буква.");
                    }
                    break;
                case 2:
                    System.out.println("Сколько цифр вы хотите склеить?");
                    int count = scanner.nextInt();
                    System.out.println("Введите " + count + " цифр");
                    for (int i = 0; i < count; i++) {
                        string = scanner.next();
                        glue[i] = string.charAt(0);
                    }
                    int x = creator.parse(glue, count);
                    System.out.println(x);
                    break;
                default:
                    System.err.println("Uncorrect commant");
                    break;
            }
        }

    }
}
