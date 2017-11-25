package com.company;


import java.util.Scanner;

public class Main {
    static int[] array;
    final static int MAX_INT =2147483647;
    final static int MIN_INT =-2147483648;
    public static void main(String[] args) {
        System.out.println("Сколько чисел вам нужно отсортировать?");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        array = new int[count];
        int current = 0;
        int lower =  MAX_INT;
        int higher = MIN_INT;

        System.out.println("Введите эти числа");

        int[] arrayClone = array;
        for (int i = 0; i<count ; i++){
            array[i] = scanner.nextInt();
            if (array[i] < lower){
                lower = array[i];
            }
            if (array[i] > higher){
                higher = array[i];
            }

        }
    }

    public int merger(int count){
        if (count < 2) {

        }
        return -1;
    }
}
