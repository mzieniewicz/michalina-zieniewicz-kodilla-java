package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(23, 1);
        } catch (Exception e) {
            System.out.println("Selected numbers cannot be used!");
        } finally {
            System.out.println(" The number X cannot be greater than 2 and less than 1. The number Y cannot be equal to 1.5. ");
        }
    }
}