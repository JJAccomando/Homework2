package com.solvd.laba;

public class Flight {

    public static int numFlights = 0;
    private int id = 0;
    private String flightNum, departFrom, arriveTo;
    private AirplaneBase plane;
    private Passenger[] passengers;
    private int seatsAvailable, seatsInFirst, seatsInBusiness, seatsInEcon, 
    seatNumFirst, seatNumBusiness, seatNumEcon, numPassengers = 0;
    

    //Flight Class constructor 
    //assigns most fields with information dependent on each plane type
    public Flight(AirplaneBase myPlane, String departFrom, String arriveTo) {
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
        this.id = ++numFlights;
    }

    //sets starting integer for seat numbers in a specific class
    //ex: AirbusA380 has 16 First Class seats. So First Class seats start at seat #1 and will end at #16
    //AirbusA380 has 92 Business Class seats. So Business Class seats start at seat #17 and will end at #109
    private void setSeats() {
        this.seatNumFirst = 1;
        this.seatNumBusiness = seatsInFirst + 1;
        this.seatNumEcon = seatNumBusiness + seatsInBusiness;
    }

    //returns flight number which is unique for each new flight
    public String getFlightNum() {
        return this.flightNum;
    }

    //checks if flight has available seats of specific seat type to be able to add a Passenger
    public boolean isAvailable(String seatType) {
        boolean available = false;
        switch (seatType) {
            case "First":
                if (this.seatsInFirst > 0)
                    available = true;
                break;

            case "Business":
                if (this.seatsInBusiness > 0)
                    available = true;
                break;

            case "Economy":
                if (this.seatsInEcon > 0)
                    available = true;
        
            default:
                break;
        }
        return available;
    }

    //checks if flight has available seats to be able to add a Passenger
    public boolean isAvailable() {
        boolean available = false;
        if (this.seatsAvailable > 0)
            available = true;
        return available;
    }

    //adds a passenger to a flight and assigns a seat number based on requested class
    //ex: seatsInFirst is set to maximum # of First Class seats based on plane type (AirbusA380 has 16 First Class seats)
    //the seat number is assigned to the passenger and the incremented to prevent another passenger from having the same seat number
    //then the seats available are decremented for that specific class and also for total seats available
    //the seat number will not be incremented when the available seats in that class reach 0 and method will return false
    //the flights count for #of passengers is incremented
    //then the passenger is added to the array of passengers
    public boolean bookSeat(Passenger person, String seatType) {
        boolean available = this.isAvailable(seatType);
        if (available) {
            switch (seatType) {
                case "First":
                    person.setSeatNum(this.seatNumFirst++);
                    --this.seatsInFirst;
                    --this.seatsAvailable;
                    ++this.numPassengers;
                    this.addPassenger(person);
                    return true;

                case "Business":
                    person.setSeatNum(this.seatNumBusiness++);
                    --this.seatsInBusiness;
                    --this.seatsAvailable;
                    ++this.numPassengers;
                    this.addPassenger(person);
                    return true;

                case "Economy":
                    person.setSeatNum(this.seatNumEcon++);
                    --this.seatsInEcon;
                    --this.seatsAvailable;
                    ++this.numPassengers;
                    this.addPassenger(person);
                    return true;
                
                default:
                    break;
            }
        }
        return false;
    }

    //adds passenger to the flight by storing the passenger in the flights list of passengers array
    //this method is called inside bookSeat method which already checks for seat availability
    //therefore; if this method is called, a passenger will always be able to be added to array
    private void addPassenger(Passenger person) {
        for (int i = 0; i < this.plane.getNumSeatsTotal(); i++) {
            if (passengers[i] == null) {
                passengers[i] = person;
                break;
            }
        }
        return;
    }

    //returns a String of a Flight object as unique flight information
    @Override
    public String toString() {
        String myFlightNum = "Flight#: " + this.flightNum;
        String departure = "Deaparting from: " + this.departFrom;
        String arrival = "Arriving to: " + this.arriveTo;
        String numberOfPassengers = "Number of passengers: " + this.numPassengers;
        String planeType = "Plane: " + this.plane.getClassification();

        String myobj = myFlightNum + "\n" + departure + "\n" + arrival + "\n"
        + numberOfPassengers + "\n" + planeType;

        return myobj;
    }

    //compares 2 Flight objects by comparing their object Strings
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj instanceof Flight) {
            Flight cast = (Flight)obj;
            return this.toString() == cast.toString();
        }
        return false;
    }

    //Flight objects hash code is set to its id#
    @Override
    public int hashCode() {
        return this.id;
    }

}
