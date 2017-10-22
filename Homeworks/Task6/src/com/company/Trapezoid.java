package com.company;

public class Trapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double height;

    public Trapezoid(double sideOne, double sideTwo, double height) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public double area() {
        return (sideOne + sideTwo) / 2 * height;
    }
}
