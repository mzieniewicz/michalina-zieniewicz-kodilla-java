package com.kodilla.stream.array;

import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {
        double result = 0;

        IntStream.range(0, numbers.length)
                .filter(n-> n !=0)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(n-> numbers[n])
                .average();
        if (average.isPresent()) {
            result = average.getAsDouble();

         }else {
            System.out.println("There are no numbers!");
        }

        System.out.println("Average =" + result);
        return result;

    }

}


