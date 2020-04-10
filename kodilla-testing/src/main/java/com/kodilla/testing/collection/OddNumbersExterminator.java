package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer temporaryNumber : numbers) {

            if (temporaryNumber % 2 == 0) {
                evenNumbers.add(temporaryNumber);
            }
        }
        return evenNumbers;

    }
}
