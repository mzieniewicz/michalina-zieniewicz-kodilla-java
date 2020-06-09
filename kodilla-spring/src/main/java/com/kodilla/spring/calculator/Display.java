package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;
import static jdk.nashorn.internal.objects.Global.Infinity;

@Component
public class Display {

    public void displayValue(double val) {
        if (val == Infinity) {
            System.out.println("You can't divide by 0 !");
        } else {
            System.out.println("The result of mathematical operation: " + val);
        }
    }
}