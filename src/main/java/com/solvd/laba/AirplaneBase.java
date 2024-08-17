package com.solvd.laba;

public class AirplaneBase {
    
    public static int numPlanes = 0;
    private int id = 0;
    private int numSeats;
    private int numSeatsFirst;
    private int numSeatsBusiness;
    private int numSeatsEcon;

    //AirplaneBase class constructor for specific type of airplane
    public AirplaneBase(int numSeats, int numSeatsFirst, int numSeatsBusiness, int numSeatsEcon) {
        this.numSeats = numSeats;
        this.numSeatsFirst = numSeatsFirst;
        this.numSeatsBusiness = numSeatsBusiness;
        this.numSeatsEcon = numSeatsEcon;
        this.id = ++numPlanes;
    }

    //basic airplane constructor
    public AirplaneBase() {
        this.id = ++numPlanes;
    }

    //returns plane classification
    //for airplane base it retruns generic String "Basic Airplane"
    public String getClassification() {
        return "Basic Airplane";
    }

    //returns total number of seats on a specific type of airplane object
    public int getNumSeatsTotal() {
        return this.numSeats;
    }

    //returns total number of seats in First Class for a specific type of airplane object
    public int getNumSeatsFirst() {
        return this.numSeatsFirst;
    }

    //returns total number of seats in Business Class for a specific type of airplane object
    public int getNumSeatsBus() {
        return this.numSeatsBusiness;
    }

    //returns total number of seats in Economy Class for a specific type of airplane object
    public int getNumSeatsEcon() {
        return this.numSeatsEcon;
    }

    //returns current total number of airplanes created
    public static int getNumPlanes() {
        return numPlanes;
    }

    //returns airplane objects id number that is unique for every plane created
    public int getID() {
        return this.id;
    }

    //returns a String of an AirplaneBase object as the object's id number
    @Override
    public String toString() {
        String myobj = "Airplane ID#: " + this.id;
        return myobj;
    }

    //compares 2 AirplaneBase objects by comparing their object Strings
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof AirplaneBase) {
            AirplaneBase cast = (AirplaneBase)obj;
            return this.id == cast.id;
        }
        return false;
    }

    //AirplaneBase objects hash code is set to its unique id#
    @Override
    public int hashCode() {
        return this.id;
    }

}
