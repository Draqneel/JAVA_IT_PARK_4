package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Menu ");
        System.out.println("1) Сложение");
        System.out.println("2) Вычитание");
        System.out.println("3) Умножение");
        System.out.println("4) Выход");


        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Введите 2 числа");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("Введите 2 числа");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println("Введите 2 числа");
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Command uncorrect");

            }


        }


    }
}

/*Ситдиков Марсель Рафаэлевич
+7(937)282-49-41

*/




