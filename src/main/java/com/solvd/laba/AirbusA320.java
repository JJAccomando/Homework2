package com.solvd.laba;

public class AirbusA320 extends AirplaneBase {
    
    private static final String CLASSIFICATION = "AA320";
    private static final int NUM_SEATS = 146;
    private static final int NUM_SEATS_FIRST = 14;
    private static final int NUM_SEATS_BUSINESS = 20;
    private static final int NUM_SEATS_ECON = 112;

    //AirbusA320 object constructor
    public AirbusA320() {
        super(NUM_SEATS, NUM_SEATS_FIRST, NUM_SEATS_BUSINESS, NUM_SEATS_ECON);
    }
    
    //overrides AirplaneBase method and returns a String "CLASSIFICATION" that is specific to all AirbusA320 objects
    public String getClassification() {
        return AirbusA320.CLASSIFICATION;
    }

    //returns a String of an AirbusA320 object as the object's "CLASSIFICATION" and id number
    @Override
    public String toString() {
        String myobj = "Airplane Classification: " + CLASSIFICATION + "\nID#: " + this.getID();
        return myobj;
    }

    //compares 2 AirbusA320 objects by comparing their object Strings
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof AirbusA320) {
            AirbusA320 cast = (AirbusA320)obj;
            return this.toString() == cast.toString();
        }
        return false;
    }

    //AirbusA320 objects hash code is set to its unique id#
    @Override
    public int hashCode() {
        return this.getID();
    }

}
