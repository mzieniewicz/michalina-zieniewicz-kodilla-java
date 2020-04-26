package com.kodilla.exception.test;

public class FirstChallenge {

    public void divide(double a, double b) {
        try {
            double result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println( "Error: " + e);

        } finally {

            System.out.println("Remember! Cannot divide by zero!");
        }

    }
    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        firstChallenge.divide(5,0);

    }
}

