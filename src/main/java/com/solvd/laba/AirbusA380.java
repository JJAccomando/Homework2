package com.solvd.laba;

public class AirbusA380 extends AirplaneBase {

    private static final String CLASSIFICATION = "AA380";
    private static final int NUM_SEATS = 520;
    private static final int NUM_SEATS_FIRST = 16;
    private static final int NUM_SEATS_BUSINESS = 92;
    private static final int NUM_SEATS_ECON = 412;

    //AirbusA380 object constructor
    public AirbusA380() {
        super(NUM_SEATS, NUM_SEATS_FIRST, NUM_SEATS_BUSINESS, NUM_SEATS_ECON);
    }

    //overrides AirplaneBase method and returns a String "CLASSIFICATION" that is specific to all AirbusA380 objects
    @Override
    public String getClassification() {
        return AirbusA380.CLASSIFICATION;
    }

    //returns a String of an AirbusA380 object as the object's "CLASSIFICATION" and id number
    @Override
    public String toString() {
        String myobj = "Airplane Classification: " + CLASSIFICATION + "\nID#: " + this.getID();
        return myobj;
    }

    //compares 2 AirbusA380 objects by comparing their object Strings
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof AirbusA380) {
            AirbusA380 cast = (AirbusA380)obj;
            return this.toString() == cast.toString();
        }
        return false;
    }

    //AirbusA380 objects hash code is set to its unique id#
    @Override
    public int hashCode() {
        return this.getID();
    }

}
