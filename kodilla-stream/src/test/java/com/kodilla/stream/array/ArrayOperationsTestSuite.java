package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverageWhenArrayIsNotEmpty(){
        //Given
        int numbers[] =new int[5];
        for (int n=0; n<5; n++){
            numbers[n]=n+1;
        }
        //When
        double averageOfNumbers = ArrayOperations.getAverage(numbers);
        //Then
        double expectAverage = 3.0;
        Assert.assertEquals(expectAverage,averageOfNumbers, 0.001);
    }
    @Test
    public void testGetAverageWhenArrayIsEmpty(){
        //Given
        int numbers[] =new int[0];
        //When
        double averageOfNumbers = ArrayOperations.getAverage(numbers);
        //Then
        double expectAverage = 0.0;
        Assert.assertEquals(expectAverage,averageOfNumbers, 0.001);
    }


    }

