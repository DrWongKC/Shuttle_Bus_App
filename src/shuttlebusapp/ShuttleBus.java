package shuttlebusapp;

/**
 *
 * @author kaichong
 */
public class ShuttleBus {
    
    String departureLocation; // type String to store the departure location
    String dayOfDeparture; // type String to store the day of departure
    int hourOfDeparture; // type int to store hour of departure
    int minuteOfDeparture; // type int to store minute of departure
    
    public ShuttleBus(String location, String departDay, int hour, int minute) // this constructor takes in four attributes when this object is initialised
    {
        this.departureLocation = location; 
        this.dayOfDeparture = departDay;
        this.hourOfDeparture = hour;
        this.minuteOfDeparture = minute;
    }

    public String toString() { // the toString method returns the values of all its attributes
        String info = "This shuttle bus departs at " + departureLocation + " on " + dayOfDeparture + " in " + hourOfDeparture + ":" + minuteOfDeparture;
        return info;
    }
    
}
