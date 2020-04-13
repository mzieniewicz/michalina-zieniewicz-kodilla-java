package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideOfTheSquare;

    public Square(double sideOfTheSquare) {
        this.sideOfTheSquare = sideOfTheSquare;
    }

    @Override
    public String getShapeName() {
        return "The square";
    }

    @Override
    public Double getField(double sideOfTheSquare) {
        double SquareField = sideOfTheSquare * sideOfTheSquare;
        return SquareField;
    }

    public double getSideOfTheSquare() {
        return sideOfTheSquare;
    }
}





