package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("I have to buy milk",shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("I have to paint the bedroom",paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }
    @Test
    public void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        drivingTask.executeTask();
        //Then
        Assert.assertEquals("I have to go to the shop", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
