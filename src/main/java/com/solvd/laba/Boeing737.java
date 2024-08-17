package com.solvd.laba;

public class Boeing737 extends AirplaneBase {
    
    private static final String CLASSIFICATION = "B737";
    private static final int NUM_SEATS = 120;
    private static final int NUM_SEATS_FIRST = 4;
    private static final int NUM_SEATS_BUSINESS = 12;
    private static final int NUM_SEATS_ECON = 104;

    //Boeing737 object constructor
    public Boeing737() {
        super(NUM_SEATS, NUM_SEATS_FIRST, NUM_SEATS_BUSINESS, NUM_SEATS_ECON);
    }

    //overrides AirplaneBase method and returns a String "CLASSIFICATION" that is specific to all Boeing737 objects
    public String getClassification() {
        return Boeing737.CLASSIFICATION;
    }

    //returns a String of an Boeing737 object as the object's "CLASSIFICATION" and id number
    @Override
    public String toString() {
        String myobj = "Airplane Classification: " + CLASSIFICATION + "\nID#: " + this.getID();
        return myobj;
    }

    //compares 2 Boeing737 objects by comparing their object Strings
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof Boeing737) {
            Boeing737 cast = (Boeing737)obj;
            return this.toString() == cast.toString();
        }
        return false;
    }

    //Boeing737 objects hash code is set to its unique id#
    @Override
    public int hashCode() {
        return this.getID();
    }

}
