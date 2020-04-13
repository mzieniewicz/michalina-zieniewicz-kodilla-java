package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    public String getShapeName() {
        return "The circle";
    }

    @Override
    public Double getField(double circleRadius) {
        double circleField = 3.14 * Math.pow(circleRadius, 2.0);
        return circleField;
    }

    public double getCircleRadius() {
        return circleRadius;
    }
}
