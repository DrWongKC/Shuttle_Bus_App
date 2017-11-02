package shuttlebusapp;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kaichong
 */
public class ShuttleBusApp {

    public static void main(String[] args) {
        
        // VARIABLES
        int numOfBuses;
        String location;
        String day;
        int hour;
        int minute;
        ShuttleBus thisBus;
        ArrayList<ShuttleBus> listOfBuses=new ArrayList();
        
        // TO ACCEPT USER INPUT
        Scanner sc = new Scanner(System.in);
        
        // REQUEST FOR THE NUMBER OF BUSSES
        do {
            System.out.println("Please enter the number of shuttle buses: (between 2 and 20)"); // Request for the number of shuttle buses
            while (!sc.hasNextInt()) { // If the input is not an integer, request user to enter integer only. Otherwise, exit while loop
                System.out.println("Please enter number only: ");
                sc.next();
            }
            numOfBuses=sc.nextInt(); // Store user's input into variable
            sc.nextLine();
        } while (numOfBuses<2||numOfBuses>20); // If input is not within specified range, ask user to enter again
        
        // GET INPUT FOR EACH BUSES
        int countInput=0;
        do {
            System.out.println("Please enter the following information for the "+convertToOrdinal(countInput+1)+" bus.");
            // LOCATION
            System.out.println("Location: ");
            location=sc.nextLine();
            // DAY
            System.out.println("Day: ");
            day=sc.nextLine();
            // HOUR
            do {
                System.out.println("Hour: (1 to 24)");
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter number only: ");
                    sc.next();
                }
                hour=sc.nextInt();
                sc.nextLine();
            } while (hour<1||hour>25);
            // MINUTE
            do {
                System.out.println("Minute: (1 to 60)");
                while (!sc.hasNextInt()) {
                    System.out.println("Please enter number only: ");
                    sc.next();
                }
                minute=sc.nextInt();
                sc.nextLine();
            } while (minute<1||minute>60);
            
            // Store ShuttleBus instance into ArrayList
            listOfBuses.add(new ShuttleBus(location, day, hour, minute));
            
            countInput++; // Increase count by one
        } while (countInput<numOfBuses);
        
        // OUTPUT TO SCREEN FOR EACH BUSES
        int countOutput=0;
        do {
            thisBus=listOfBuses.remove(0);
            System.out.println(thisBus.toString()); // Print out information of ShuttleBus object
            countOutput++;
        } while (countOutput<numOfBuses);
        
        // DEBUGGING PURPOSES
        //ShuttleBus busOne = new ShuttleBus("Tampines", "Monday", 8, 30); // initialise an instance of a ShuttleBus object
        //ShuttleBus busTwo = new ShuttleBus("Bedok", "Tuesday", 8, 15); // initialise a second instance of a ShuttleBus object
        //System.out.println(busOne.toString()); // prints out all the attributes of the first ShuttleBus instance
        //System.out.println(busTwo.toString()); // prints out all the attributes of the second ShuttleBus instance
        
    }
    
    // RETURNS THE ORDINAL OF THE CITY'S INDEX
    public static String convertToOrdinal(int index)
    {
        if (index==1)
            return "first";
        if (index==2)
            return "second";
        if (index==3)
            return "third";
        if (index==4)
            return "fourth";
        if (index==5)
            return "fifth";
        
        if (index==6)
            return "sixth";
        if (index==7)
            return "seventh";
        if (index==8)
            return "eighth";
        if (index==9)
            return "ninth";
        if (index==10)
            return "tenth";
        
        if (index==11)
            return "eleventh";
        if (index==12)
            return "twelfth";
        if (index==13)
            return "thirteenth";
        if (index==14)
            return "fourteenth";
        if (index==15)
            return "fifteenth";
        
        if (index==16)
            return "sixteenth";
        if (index==17)
            return "seventeenth";
        if (index==18)
            return "eighteenth";
        if (index==19)
            return "nineteenth";
        if (index==20)
            return "twentieth";
        
        return null;
    }
    
    
}
