package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to repository on your desktop!");
        System.out.println("1) Add in end");
        System.out.println("2) Add in start");
        System.out.println("3) Delete elements");
        System.out.println("4) Wiew repository");
        int a[] = new int[100];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (true) {
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("What element you wanna add in end?");
                    n = scanner.nextInt();
                    a[count] = n;
                    count++;
                    break;

                case 2:
                    System.out.println("What element you wanna add in start?");
                    n = scanner.nextInt();
                    if (a[0] == 0) {
                        a[0] = n;
                        count++;
                    } else {
                        a[0] = n;
                    }
                    break;

                case 3:
                    System.out.println("What number of element that you wanna delete?");
                    n = scanner.nextInt();
                    if (n == count) {
                        a[count - 1] = 0;
                        count = count - 1;
                    } else {
                        n = n - 1;
                        for (int i = n; i < count - 1; i++) {
                            a[i] = a[i + 1];

                        }
                        a[count - 1] = 0;
                        count = count - 1;
                    }
                    break;
                case 4:
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                        if (i % 10 == 9) {
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("Command is uncorrect");
                    break;
            }
        }
    }


}


