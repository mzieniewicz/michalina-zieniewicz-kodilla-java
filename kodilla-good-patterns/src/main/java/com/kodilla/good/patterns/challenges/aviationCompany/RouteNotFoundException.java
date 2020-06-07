package com.kodilla.good.patterns.challenges.aviationCompany;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message){
        super(message);
    }
}
