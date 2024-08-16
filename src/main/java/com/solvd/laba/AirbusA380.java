package com.solvd.laba;

public class AirbusA380 extends Airplane {

    private static final String CLASSIFICATION = "AA380";
    private static final int NUM_SEATS = 520;
    private static final int NUM_SEATS_FIRST = 16;
    private static final int NUM_SEATS_BUSINESS = 92;
    private static final int NUM_SEATS_ECON = 412;

    public AirbusA380() {
        super(NUM_SEATS, NUM_SEATS_FIRST, NUM_SEATS_BUSINESS, NUM_SEATS_ECON);
    }

    @Override
    public String getClassification() {
        return AirbusA380.CLASSIFICATION;
    }

    @Override
    public String toString() {
        String myobj = "Classification: " + CLASSIFICATION + "\nID#: " + this.getID();
        myobj += " " + this.getNumSeatsTotal() + " " + this.getNumSeatsFirst() + " " + this.getNumSeatsBus() + " " + this.getNumSeatsEcon();
        return myobj;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof AirbusA380) {
            AirbusA380 cast = (AirbusA380)obj;
            return this.getID() == cast.getID();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getID();
    }
}
