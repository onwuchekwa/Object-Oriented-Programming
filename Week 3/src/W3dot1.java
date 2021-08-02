/*
    Write a short Java program that does the following:

    1. Tells the user what the program does.
    2. Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
    3. Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
    4. Prompts the user to enter some number of days in the future. This can be any positive value.
    5. Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
    6. Calculates the day of the week for the future day.
    7. Displays the day of the week for today and the day of the week for the future day.
    8. Outputs a goodbye message.

    Given today's day of the week and some number of days in the future
    this program will tell you the day of the week for the future day.
    Enter today's day of the week (0 for Sunday, 1 for Monday, etc): 1
    Enter the number of days in the future: 15

    Today is Monday and the future day is Tuesday.
    Goodbye.

    Given today's day of the week and some number of days in the future
    this program will tell you the day of the week for the future day.
    Enter today's day of the week (0 for Sunday, 1 for Monday, etc): 1
    Enter the number of days in the future: -5

    -5 is invalid. You must enter a positive number.
    Goodbye.
 */

/*
    @author: Sunday Ogbonnaya Onwuchekwa
 */

import java.util.Scanner;

public class W3dot1 {
    public static void main(String[] args) {
        //Declare Variables
        int today, futureDay, futureWeekDay;

        //Tells the user what the program does.
        System.out.println("Given today's day of the week and some number of days in the future" +
                "\nthis program will tell you the day of the week for the future day.");

        // Create Scanner Class
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
        System.out.print("Enter today's day of the week (0 for Sunday, 1 for Monday, etc): ");

        // Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
        today = input.nextInt();

        if (today < 0 || today > 6) {
            System.out.print( "\n" + today + " is invalid. Today's day values must be between between 0 and 6, inclusive.\nGoodbye.");
            System.exit(1);
        } else {
            // Prompts the user to enter some number of days in the future. This can be any positive value.
            System.out.print("Enter the number of days in the future: ");

            // Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
            futureDay = input.nextInt();

            //Calculate the number of days in the future
            futureWeekDay = futureDay % 7 + today;

            if (futureWeekDay >= 7)
                futureWeekDay %= 7;

            if (futureDay < 0) {
                System.out.print("\n" + futureDay + " is invalid. You must enter a positive number.\nGoodbye.");
                System.exit(1);
            }

            System.out.println("\nToday is " + getFutureDay(today) + " and the future day is " + getFutureDay(futureWeekDay) + ".\nGoodbye.");
        }
    }

    // Get Day of the week and future day function
    public static String getFutureDay(int day) {
        String dayName;

        switch (day) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = day + " is invalid ";
                break;
        }
        return dayName;
    }
}
