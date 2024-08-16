package com.solvd.laba;

public class Flight {

    private String flightNum, departFrom, arriveTo;
    private Airplane plane;
    private Passenger[] passengers;
    private int seatsAvailable, seatsInFirst, seatsInBusiness, seatsInEcon, 
    seatNumFirst, seatNumBusiness, seatNumEcon, numPassengers = 0;
    //seatIndex for 


    public Flight(Airplane myPlane, String departFrom, String arriveTo) {
        this.plane = myPlane;
        this.seatsAvailable = myPlane.getNumSeatsTotal();
        this.seatsInFirst = myPlane.getNumSeatsFirst();
        this.seatsInBusiness = myPlane.getNumSeatsBus();
        this.seatsInEcon = myPlane.getNumSeatsEcon();
        this.flightNum = myPlane.getClassification() + plane.getID();
        this.departFrom = departFrom;
        this.arriveTo = arriveTo;
        this.passengers = new Passenger[myPlane.getNumSeatsTotal()];
        this.setSeats();
    }

    private void setSeats() {
        this.seatNumFirst = 1;
        this.seatNumBusiness = seatsInFirst + 1;
        this.seatNumEcon = seatNumBusiness + seatsInBusiness;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public boolean isAvailable() {
        if (this.seatsAvailable > 0)
            return true;
        return false;
    }

    public boolean bookSeat(Passenger person, String seatType) {
        switch (seatType) {
            case "First":
                if (this.seatsInFirst > 0) {
                    person.setSeatNum(this.seatNumFirst++);
                    --this.seatsInFirst;
                    --this.seatsAvailable;
                    ++this.numPassengers;
                    this.addPassenger(person);
                    return true;
                }

            case "Business":
                if (this.seatsInBusiness > 0) {
                    person.setSeatNum(this.seatNumBusiness++);
                    --this.seatsInBusiness;
                    --this.seatsAvailable;
                    ++this.numPassengers;
                    this.addPassenger(person);
                    return true;
                }

            case "Economy":
                if (this.seatsInEcon > 0) {
                    person.setSeatNum(this.seatNumEcon++);
                    --this.seatsInEcon;
                    --this.seatsAvailable;
                    ++this.numPassengers;
                    this.addPassenger(person);
                    return true;
                }

            default:
                return false;
        }
    }

    private void addPassenger(Passenger person) {
        for (int i = 0; i < this.plane.getNumSeatsTotal(); i++) {
            if (passengers[i] == null) {
                passengers[i] = person;
                return;
            }
        }
        return;
    }

    public void printFlightInfo() {
        System.out.println("Flight #: " + this.flightNum);
        System.out.println("Deaparting from: " + this.departFrom);
        System.out.println("Arriving to: " + this.arriveTo);
        System.out.println("Number of passengers: " + this.numPassengers);
        System.out.println("Plane: " + this.plane.getClassification());
    }

    public int seatsAvailable() {
        return this.seatsAvailable;
    }
}
