package com.company;


public class Triangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private double angleBetween;

    public Triangle(double sideOne, double sideTwo, double angleBetween) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.angleBetween = angleBetween;
    }

    private double angleCreator(double angleBetween) {
        return angleBetween * Math.PI / 180;
    }

    @Override
    public double area() {
        return (Math.sin(angleCreator(angleBetween)) * sideOne * sideTwo) / 2;
    }
}
