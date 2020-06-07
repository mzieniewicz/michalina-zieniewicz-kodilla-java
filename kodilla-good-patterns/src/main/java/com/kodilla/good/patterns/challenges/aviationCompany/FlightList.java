package com.kodilla.good.patterns.challenges.aviationCompany;

import java.util.ArrayList;
import java.util.List;

public class FlightList {
    private List<Flight> theFlightsList = new ArrayList<>();

    public FlightList(List<Flight> theFlightsList) {
        this.theFlightsList = theFlightsList;
    }

    public List<Flight> getTheFlightsList() {
        return theFlightsList;
    }
}
