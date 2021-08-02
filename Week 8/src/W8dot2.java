import java.util.Date;

public class W8dot2 {
    public static void main(String[] args){
        // Tells the user what the program does.
        System.out.println("This program uses the Date class to display a set of dates and times.\n");
        // Create a Date Object
        Date newDate = new Date();
        /*
            Set Date Object's elapsed time to 10000, 100000, 10000000, 100000000, 1000000000,
            10000000000, and 100000000000.
         */
        for(long i = 10000L; i <= 100000000000L; i *= 10){
            newDate.setTime(i);
            // Displays the data and time using the toString() method
            if ( i != 10000)
                System.out.println(newDate.toString());
        }
        // Display a goodbye
        System.out.println("\nGoodbye ...");
    }
}
