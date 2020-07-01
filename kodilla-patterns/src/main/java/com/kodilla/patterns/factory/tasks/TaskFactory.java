package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass){
        switch(taskClass){
            case SHOPPING:
                return new ShoppingTask("I have to buy milk", "milk", 2.0);
            case PAINTING:
                return new PaintingTask("I have to paint the bedroom","grey", "the two walls");
            case DRIVING:
                return new DrivingTask("I have to go to the shop", "The shop"," my car");
            default:
                return null;
        }
    }
}
