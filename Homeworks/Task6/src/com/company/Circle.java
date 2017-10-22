package com.company;

public class Circle extends Figure {
    private static final int DEFAULT_VALUE = 0;
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = DEFAULT_VALUE;
        }
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
