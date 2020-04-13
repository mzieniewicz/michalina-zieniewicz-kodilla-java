package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private Shape shape;
    private ArrayList<Shape> listOfFigures = new ArrayList<Shape>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        listOfFigures.add(shape);
    }

    public Shape getFigure(int shapeNumber) {
        Shape shape = null;
        if (shapeNumber >= 0 && shapeNumber < listOfFigures.size()) {
            shape = listOfFigures.get(shapeNumber);
        }
        return shape;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (listOfFigures.contains(shape)) {
            listOfFigures.remove(shape);
            result = true;
        }
        return result;
    }

    public int getFigureQuantity() {
        return listOfFigures.size();
    }

    public void showFigures() {
        System.out.println(" Figure is: a " + shape.getShapeName());
    }
}
