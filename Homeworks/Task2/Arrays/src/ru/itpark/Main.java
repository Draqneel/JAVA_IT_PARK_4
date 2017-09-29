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
        System.out.println("5) Sort your repository");
        int a[] = new int[100];
        int array[];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        while (true) {
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("What element you wanna add in end?");
                    if (count == 100) {
                        System.out.println("Array is full. You'll swap last element");
                    }
                    n = scanner.nextInt();

                    a[count] = n;
                    count++;
                    break;

                case 2:
                    System.out.println("What element you wanna add in start?");
                    if (count == 100) {
                        System.out.println("Array is full. You'll swap 1st element");
                    }
                    n = scanner.nextInt();
                    array = addINStart(n, a, count);
                    a = array;
                    count++;
                    break;

                case 3:
                    System.out.println("What number of element that you wanna delete?");
                    n = scanner.nextInt();
                    if (count == 0) {
                        System.out.println("You can't delete elements because count = null");
                        break;
                    }
                    if (n > 100 || n < 1 || a[n] == 0) {
                        System.out.println("Range is uncorrect or you choose 'null' element");
                        break;
                    }
                    array = deleteElemens(n, a, count);
                    a = array;
                    count = --count;
                    break;
                case 4:
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                        if (i % 10 == 9) {
                            System.out.println();
                        }
                    }
                    break;
                case 5:
                    array = sort(a, count);
                    a = array;
                    System.out.println("Sorting coplete!");
                    break;
                default:
                    System.out.println("Command is uncorrect");
                    break;
            }
        }
    }

    public static int[] addINStart(int k, int[] h, int countFunc) {
        for (int i = countFunc; i > 0; i--) {
            h[i] = h[i - 1];
        }
        h[0] = k;
        return h;

    }

    public static int[] deleteElemens(int k, int[] h, int countFunc) {
        if (k == countFunc) {
            h[countFunc - 1] = 0;
        } else {
            k = k - 1;
            for (int i = k; i < countFunc - 1; i++) {
                h[i] = h[i + 1];

            }
            h[countFunc - 1] = 0;

        }

        return h;
    }

    public static int[] sort(int[] h, int countFunc) {
        for (int i = 0; i < countFunc; i++) {
            int min = h[i];
            int imin = i;

            for (int j = i + 1; j < countFunc; j++) {
                if (h[j] < min) {
                    imin = j;
                }
            }

            if (i != imin) {
                int temp = h[i];
                h[i] = h[imin];
                h[imin] = temp;
            }


        }
        return h;
    }


}



