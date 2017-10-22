package com.company;

public class Square extends Rectangle {
    private static final int DEFAULT_VALUE = 0;
    private static double sideOne;

    public Square(double sideOne) {
        super(sideOne, sideOne);
        this.sideOne = sideOne;
        if (sideOne < 0) {
            this.sideOne = DEFAULT_VALUE;
        }

    }

    public double area() {
        return sideOne * sideOne;
    }
}
