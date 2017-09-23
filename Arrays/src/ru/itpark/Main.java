package ru.itpark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i = i++) {
            a[i]= scanner.nextInt();
        }
        for (int i = 0; i < a.length; i = i++) {
            a[i]=a[n];
            n=n-1;
            }
            


        }

    }
