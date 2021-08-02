/*
    Write a short Java program that does the following:

    Tells the user what the program does.
    Prompts the user to enter a year.
    Gets the user's input and saves it.
    Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
    Gets the user's input and saves it. If the value is is not between 1 and 12 inclusive, tell the user and terminate the program.
    Calculates the number of days in that month. Your program should correctly handle leap years (see listing 3.7 in the textbook).
    Displays the number of days in that month.
    Outputs a goodbye message.

    Given a year and a month in that year, this program will tell you
    the number of days in that month.
    Enter a year: 1953
    Enter a value for the month(1 = Jan, 2 = Feb, etc): 3

    March of 1953 has 31 days in it.
    Goodbye.

    Given a year and a month in that year, this program will tell you
    the number of days in that month.
    Enter a year: 2020
    Enter a value for the month(1 = Jan, 2 = Feb, etc): 13

    13 is invalid. Month values must be between between 1 and 12, inclusive.
    Goodbye.
 */

/*
    @author: Sunday Ogbonnaya Onwuchekwa
 */

import java.util.Scanner;

public class W3dot2 {
    public static void main(String[] args) {

        //Tells the user what the program does.
        System.out.println("Given a year and a month in that year, this program will tell you\n" +
                "the number of days in that month.");

        //Create Scanner class
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter a year.
        System.out.print("Enter a year: ");

        // Gets the user's input and saves it.
        int fullYear = input.nextInt();

        //Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
        System.out.print("Enter a value for the month(1 = Jan, 2 = Feb, etc): ");

        //Gets the user's input and saves it. If the value is is not between 1 and 12 inclusive, tell the user and terminate the program.
        int month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.print( "\n" + month + " is invalid. Month values must be between 1 and 12, inclusive.\nGoodbye.");
            System.exit(1);
        }

        // Displays the number of days in that month and a Goodbye message
        String[] textValue = getMonthDetail(month, fullYear);
        System.out.println("\n" + textValue[0] + " of " + fullYear + " has " + textValue[1] + " days in it.\nGoodbye.");
    }

    public static String[] getMonthDetail(int month, int fullYear) {
        //Declare variables
        String monthName, daysCountPerMonth;

        //Calculates the number of days in that month. Your program should correctly handle leap years (see listing 3.7 in the textbook).
        switch (month) {
            case 1:
                monthName = "January";
                daysCountPerMonth = "31";
                break;
            case 2:
                monthName = "February";
                if ((fullYear % 4 == 0) && (fullYear % 100 != 0) || (fullYear % 400 == 0))
                    daysCountPerMonth = "29";
                else
                    daysCountPerMonth = "28";
                break;
            case 3:
                monthName = "March";
                daysCountPerMonth = "31";
                break;
            case 4:
                monthName = "April";
                daysCountPerMonth = "30";
                break;
            case 5:
                monthName = "May";
                daysCountPerMonth = "31";
                break;
            case 6:
                monthName = "June";
                daysCountPerMonth = "30";
                break;
            case 7:
                monthName = "July";
                daysCountPerMonth = "31";
                break;
            case 8:
                monthName = "August";
                daysCountPerMonth = "31";
                break;
            case 9:
                monthName = "September";
                daysCountPerMonth = "30";
                break;
            case 10:
                monthName = "October";
                daysCountPerMonth = "31";
                break;
            case 11:
                monthName = "November";
                daysCountPerMonth = "30";
                break;
            case 12:
                monthName = "December";
                daysCountPerMonth = "31";
                break;
            default:
                monthName = "Invalid month";
                daysCountPerMonth = "Unknown";
                break;
        }
        return new String[] {monthName, daysCountPerMonth};
    }
}
