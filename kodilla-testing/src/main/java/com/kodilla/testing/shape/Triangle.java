package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double sideOfTheTriangle;

    public Triangle(double sideOfTheTriangle) {
        this.sideOfTheTriangle = sideOfTheTriangle;
    }

    @Override
    public String getShapeName() {
        return " The triangle";
    }

    @Override
    public Double getField(double sideOfTheTriangle) {
        double TriangleField = sideOfTheTriangle * sideOfTheTriangle * Math.sqrt(3.0) / 2;
        return TriangleField;
    }

    public double getSideOfTheTriangle() {
        return sideOfTheTriangle;
    }
}
