package com.solvd.laba;

public class RunAll {
    public static void main(String[] args) {
        
        String airportA = "LAX";
        String airportB = "JFK";
        AirbusA380 planeA = new AirbusA380();
        Passenger personA = new Passenger("John", "Accomando");

        Flight flightA = new Flight(planeA, airportA, airportB);
        flightA.printFlightInfo();
        System.out.println(flightA.seatsAvailable());
        
        personA.printPassengerInfo();
        if (personA.getSeatNum() == -1)
            System.out.println("Passenger has not been assigned to a flight.");
    }
}
