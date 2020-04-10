package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.*;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin ");
    }

    @After
    public void after() {
        System.out.println("Test Case: end ");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        System.out.println(" Testing the empty list" + result);
        //Then
        Assert.assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(3, 5, 6, 7, 8, 11, 45, 12);
        //When
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        System.out.println(" Testing the list" + result);
        //Then
        List<Integer> evenList = Arrays.asList(6, 8, 12);
        Assert.assertEquals(evenList, result);

    }


}
