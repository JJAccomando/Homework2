package com.solvd.laba;

public class Airplane {
    
    public static int numPlanes = 0;
    private int id = 0;
    private int numSeats;
    private int numSeatsFirst;
    private int numSeatsBusiness;
    private int numSeatsEcon;

    public Airplane(int numSeats, int numSeatsFirst, int numSeatsBusiness, int numSeatsEcon) {
        this.numSeats = numSeats;
        this.numSeatsFirst = numSeatsFirst;
        this.numSeatsBusiness = numSeatsBusiness;
        this.numSeatsEcon = numSeatsEcon;
        this.id = ++numPlanes;
    }

    public Airplane() {
        this.id = ++numPlanes;
    }

    public String getClassification() {
        return "Basic Airplane";
    }

    public int getNumSeatsTotal() {
        return this.numSeats;
    }

    public int getNumSeatsFirst() {
        return this.numSeatsFirst;
    }

    public int getNumSeatsBus() {
        return this.numSeatsBusiness;
    }

    public int getNumSeatsEcon() {
        return this.numSeatsEcon;
    }

    public static int getNumPlanes() {
        return numPlanes;
    }

    public int getID() {
        return this.id;
    }

    @Override
    public String toString() {
        String myobj = "ID#: " + this.id;
        return myobj;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof Airplane) {
            Airplane cast = (Airplane)obj;
            return this.id == cast.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

}
