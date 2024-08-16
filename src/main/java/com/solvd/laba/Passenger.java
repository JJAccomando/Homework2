package com.solvd.laba;

public class Passenger {
    
    private String firstName;
    private String lastName;
    private int id = 0;
    public static int numPassengers = 0;
    private Luggage[] myBags;
    private int seatNum = -1;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numPassengers;
    }

    public void printPassengerInfo() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Passenger ID #: " + this.id);
    }

    /*public void addBags(Luggage bag) {

    }*/
    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public int getSeatNum() {
        return this.seatNum;
    }

    @Override
    public String toString() {
        String myobj = "ID#: " + id;
        return myobj;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof Passenger) {
            Passenger cast = (Passenger)obj;
            return id == cast.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
