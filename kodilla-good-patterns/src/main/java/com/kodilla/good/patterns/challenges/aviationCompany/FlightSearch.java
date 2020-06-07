package com.kodilla.good.patterns.challenges.aviationCompany;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    public void searchFlightsFrom(List<Flight> theFlightsList, String outletFrom) {
        theFlightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(outletFrom))
                .forEach(System.out::println);
    }

    public void searchFlightsTo(List<Flight> theFlightsList, String arrivalTo) {
        theFlightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalTo))
                .forEach(System.out::println);
    }

    public void searchConnectingFlights(List<Flight> theFlightsList, String outletFrom, String arrivalTo) throws RouteNotFoundException {
        List<Flight> listToTheTransferCities = theFlightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(outletFrom))
                .collect(Collectors.toList());
        List<Flight> listFromTheTransferCities = theFlightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalTo))
                .collect(Collectors.toList());

        if (listToTheTransferCities.isEmpty() || listToTheTransferCities.isEmpty()) {

            throw new RouteNotFoundException("This plane connection does not exist!");

        } else {
            for (Flight flightTo : listToTheTransferCities) {
                for (Flight flightFrom : listFromTheTransferCities) {
                    if (flightTo.getDepartureAirport().equals(flightFrom.getArrivalAirport())) {
                        System.out.println(flightTo);
                        System.out.println(flightFrom);

                    }
                }

            }

        }
    }
}