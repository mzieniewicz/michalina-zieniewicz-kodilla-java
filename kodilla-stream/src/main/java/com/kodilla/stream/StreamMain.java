package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "This is an example text.";
        System.out.println("Decorating text: " + text +" with lambdas");

        poemBeautifier.beautify(text,(String)-> "ABC " +text+" ABC");
        poemBeautifier.beautify(text,(String)-> "**** " +text+" ****");
        poemBeautifier.beautify(text,(String)-> toUpperCase(text) );

        String nextText = "This text is prettier";
        poemBeautifier.beautify(text,(String)-> "!!!!!!!!!!!!!! " +nextText+" !!!!!!!!!!!!!!");
        poemBeautifier.beautify(text,(String)-> nextText + ". This text length: "+ nextText.length() );
        poemBeautifier.beautify(text,(String)-> toLowerCase(text) );


    }
}
