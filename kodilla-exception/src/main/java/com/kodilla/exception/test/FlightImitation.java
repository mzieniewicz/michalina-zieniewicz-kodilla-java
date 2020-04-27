package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightImitation {

    public Map<String, Boolean> getFilghts(){
        Map<String, Boolean> filghtAirport = new HashMap<>();
        filghtAirport.put("New York", true);
        filghtAirport.put("Warsaw", true);
        filghtAirport.put("Moscow", false);
        filghtAirport.put("Barcelona", true);
        filghtAirport.put("Berlin", false);

        return filghtAirport;
    }

    public  Boolean findFilght(Flight flight) throws RouteNotFoundException {
        if (getFilghts().containsKey(flight.getArrivalAirport()) && getFilghts().get(flight.getArrivalAirport())){
            return true;
        }
        throw  new RouteNotFoundException ("This plane connection does not exist!");
    }

    public static void main(String[] args) {
        FlightImitation flightImitation =new FlightImitation();

        try {
            flightImitation.findFilght(new Flight("Berlin","Moscow"));
            System.out.println("Flight found!");

        } catch (RouteNotFoundException e) {
            System.out.println("This plane connection does not exist!");
        } finally {
            System.out.println("Select an existing airplane connection!");
        }
    }
}