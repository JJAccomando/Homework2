package com.solvd.laba;

public class AirbusA320 extends Airplane {
    
    private static final String CLASSIFICATION = "AA320";
    private static final int NUM_SEATS = 520;
    private static final int NUM_SEATS_FIRST = 16;
    private static final int NUM_SEATS_BUSINESS = 92;
    private static final int NUM_SEATS_ECON = 412;

    public AirbusA320() {
        super(NUM_SEATS, NUM_SEATS_FIRST, NUM_SEATS_BUSINESS, NUM_SEATS_ECON);
    }
    
    public String getClassification() {
        return AirbusA320.CLASSIFICATION;
    }

    @Override
    public String toString() {
        String myobj = "Classification: " + CLASSIFICATION + "\nID#: " + this.getID();
        return myobj;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof AirbusA320) {
            AirbusA320 cast = (AirbusA320)obj;
            return this.getID() == cast.getID();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getID();
    }
}
