package com.solvd.laba;

public class RunAll {
    public static void main(String[] args) {
        
        String airportA = "LAX";                                 //
        String airportB = "JFK";                                 //
        Boeing737 planeA = new Boeing737();                      //
        Boeing737 planeB = new Boeing737();                      //
        AirbusA320 planeC = new AirbusA320();                    //
        Flight flightA = new Flight(planeA, airportA, airportB); //
        Flight flightB = new Flight(planeB, airportA, airportB); //
        Flight flightC = new Flight(planeC, airportA, airportB); //creating 3 specific plane objects and 3 flight objects

        System.out.println(flightA.toString() + "\n"); //prints out flight information to show that object creation was successful
        System.out.println(flightB.toString() + "\n"); //2 flights have the same type of plane so this shows that each flight still gets a unique flight number 
        System.out.println(flightC.toString());        //also shows that 0 passengers have been assigned to flight

        Passenger personA = new Passenger("Steve", "Jobs"); //
        Passenger personB = new Passenger("Elon", "Musk");  //creates 2 unique passenger objects

        personA.addBags(35); //adds regular luggage to personA
        personA.addBags(55); //adds oversize luggage to personA

        if (personA.myBags[0].isOverweight)
            System.out.println("\nBag ID# " + personA.myBags[1].getID() + " is overweight.\n"); //should not print anything because personA's first bag was not overweight
        if (personA.myBags[1].isOverweight)
            System.out.println("\nBag ID# " + personA.myBags[1].getID() + " is overweight.\n"); //should print because personA's second bag was over weight

        if (flightA.isAvailable()) { //checks to see if flight has any available seats
            if (flightA.isAvailable("First"))       //
                flightA.bookSeat(personA, "First"); //if flight has available first class seats then book a seat for personA
            if (flightA.isAvailable("Business"))       //
                flightA.bookSeat(personB, "Business"); //if flight has available business class seats then book a seat for personB
        }

        System.out.println(flightA.toString() + "\n"); //print out flight information to show there are now 2 passengers on the flight
        System.out.println(personA.getSeatNum()); //
        System.out.println(personB.getSeatNum()); //prints out the passengers seat numbers to show that they are in different spots on the flight
    }
}
