package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figures[] = new Figure[6];
        int command;
        while (true) {
            System.out.println("0)Find the area of parallelogram");
            System.out.println("1)Find the area of rectangle");
            System.out.println("2)Find the area of square");
            System.out.println("3)Find the area of triangle");
            System.out.println("4)Find the area of circle");
            System.out.println("5)Find the area of trapezoid");
            command = scanner.nextInt();
            double a;
            double b;
            double c;
            switch (command) {
                case 0:
                    System.out.println("Enter the sides of parallelogram (side > 0)");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.println("Enter the angle between this sides (angle > 0)");
                    c = scanner.nextDouble();
                    figures[command] = new Parallelogram(a, b, c);
                    if (figures[command].area() > 0) {
                        System.out.println("The area of this parallelogram " + figures[command].area());
                    } else {
                        System.err.println("Uncorrect values");
                    }
                    System.out.println();
                    break;
                case 1:
                    System.out.println("Enter the sides of rectangle (side > 0)");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    figures[command] = new Rectangle(a, b);
                    if (figures[command].area() > 0) {
                        System.out.println("The area of this rectangle " + figures[command].area());
                    } else {
                        System.err.println("Uncorrect values");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter the side of square (side > 0)");
                    a = scanner.nextDouble();
                    figures[command] = new Square(a);
                    if (figures[command].area() > 0) {
                        System.out.println("The area of square " + figures[command].area());
                    } else {
                        System.err.println("Uncorrect value");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter the sides of triangle (side > 0)");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.println("Enter the angle between this sides (angle > 0)");
                    c = scanner.nextDouble();
                    figures[command] = new Triangle(a, b, c);
                    if (figures[command].area() > 0) {
                        System.out.println("The area of this triangle " + figures[command].area());
                    } else {
                        System.err.println("Uncorrect values");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter the radius of circle (radius > 0)");
                    a = scanner.nextDouble();
                    figures[command] = new Circle(a);
                    if (figures[command].area() > 0) {
                        System.out.println("The area of this circle " + figures[command].area());
                    } else {
                        System.err.println("Uncorrect values");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter the sides of trapezoid (side > 0)");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    System.out.println("Enter the height of teapezoid (angle > 0)");
                    c = scanner.nextDouble();
                    figures[command] = new Trapezoid(a, b, c);
                    if (figures[command].area() > 0) {
                        System.out.println("The area of this trapeziod " + figures[command].area());
                    } else {
                        System.err.println("Uncorrect values");
                    }
                    System.out.println();
                    break;
                default:
                    System.err.println("Uncorrect command");
                    System.out.println();
                    break;
            }

        }

    }
}
