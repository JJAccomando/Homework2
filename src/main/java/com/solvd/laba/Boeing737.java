package com.solvd.laba;

public class Boeing737 extends Airplane {
    
    private static final String CLASSIFICATION = "B737";
    private static final int NUM_SEATS = 120;
    private static final int NUM_SEATS_FIRST = 4;
    private static final int NUM_SEATS_BUSINESS = 12;
    private static final int NUM_SEATS_ECON = 104;

    public Boeing737() {
        super(NUM_SEATS, NUM_SEATS_FIRST, NUM_SEATS_BUSINESS, NUM_SEATS_ECON);
    }

    public String getClassification() {
        return Boeing737.CLASSIFICATION;
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
        if (obj instanceof Boeing737) {
            Boeing737 cast = (Boeing737)obj;
            return this.getID() == cast.getID();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.getID();
    }
}
