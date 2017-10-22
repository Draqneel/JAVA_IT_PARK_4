package com.company;

public class Parallelogram extends Figure {
    private static final int DEFAULT_VALUE = -1;
    private static double sideOne;
    private static double sideTwo;
    private static double angleBetween;

    public Parallelogram(double sideOne, double sideTwo, double angleBetween) {
        if (sideOne > 0) {
            this.sideOne = sideOne;
        } else {
            this.sideOne = DEFAULT_VALUE;
        }
        if (sideTwo > 0) {
            this.sideTwo = sideTwo;
        } else {
            this.sideTwo = DEFAULT_VALUE;
        }
        if (angleBetween > 0) {
            this.angleBetween = angleBetween;
        } else {
            this.angleBetween = DEFAULT_VALUE;
        }
    }

    private double angleCreator(double angleBetween) {
        return angleBetween * Math.PI / 180;
    }

    @Override
    public double area() {
        return Math.sin(angleCreator(angleBetween)) * sideOne * sideTwo;
    }
}
