/*
    Write a short Java program that does the following:

    1. Tells the user what the program does.
    2. Prompts the user to enter their first and last name.
    3. Gets the user's input and saves it as a String.
    4. Prompts the user to enter the number of hours they worked this week.
    5. Gets the user's input and saves it.
    6. Prompts the user to enter their hourly wage.
    7. Get's the user's input and saves it.
    8. Calculates the state withholding tax (0.09%) and the federal withholding tax (0.20%).
    9. Calculates your gross pay and your pay after subtracting the withholding taxes.
    10. Outputs a pay statement as shown in the example below.
    11. Outputs a goodbye message.

 */

/*
    @author: Sunday Ogbonnaya Onwuchekwa
*/

import java.util.Scanner;

public class W4dot2 {
    public static void main(String[] args) {
        //Declare variable
        double hours, hourlyWages, stateTax, federalTax, grossPay, netPay;
        String hour, hourlyWage, clientName;

        //Tells the user what the program does.
        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your\n" +
                "gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "It then displays your pay stub.");

        //Create a Scanner Class
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter their first and last name.
        System.out.print("Enter your first and last name: ");

        //Gets the user's input and saves it as a String.
        clientName = input.nextLine();

        //Check if name has a number
        for (char cn : clientName.toCharArray()) {
            if (Character.isDigit(cn)) {
                System.out.println("\nInvalid Name. You must provide valid name without digits.\nGoodbye.");
                System.exit(1);
            }
        }

        //Prompts the user to enter the number of hours they worked this week.
        System.out.print("Enter the hours you worked this week: ");

        //Gets the user's input and saves it.
        hour = input.next();

        //Pattern to validate input
        String doublePattern = "[0-9]*\\.?[0-9]+";

        //Check if hour matches pattern
        if (!hour.matches(doublePattern)) {
            System.out.println("\n" + hour + " is not a valid number.\nGoodbye.");
            System.exit(1);
        }

        //Prompts the user to enter their hourly wage.
        System.out.print("Enter your hourly wage: ");

        //Get's the user's input and saves it.
        hourlyWage = input.next();

        //Check if hourly Wage matches pattern
        if (!hourlyWage.matches(doublePattern)) {
            System.out.println("\n" + hourlyWage + " is not a valid number.\nGoodbye.");
            System.exit(1);
        }

        //Convert Strings to Double
        hours = Double.parseDouble(hour);
        hourlyWages = Double.parseDouble(hourlyWage);

        //Calculates the state withholding tax (0.09%) and the federal withholding tax (0.20%).
        stateTax = getGrossPay(hours, hourlyWages) * 0.09;
        federalTax = getGrossPay(hours, hourlyWages) * 0.20;

        //Calculates your gross pay and your pay after subtracting the withholding taxes.
        grossPay = getGrossPay(hours, hourlyWages);
        netPay = grossPay - (stateTax + federalTax);

        //Outputs a pay statement as shown in the example below.
        //Outputs a goodbye message.
        System.out.printf("%nPay Stub for %s%n", clientName);
        System.out.printf("Hours Worked: %,.1f%n", hours);
        System.out.printf("Hourly Wage: $%,.2f%n", hourlyWages);
        System.out.printf("Gross Pay: $%,.2f%n", grossPay);
        System.out.printf("State Tax Withheld: $%,.2f%n", stateTax);
        System.out.printf("Federal Tax Withheld: $%,.2f%n", federalTax);
        System.out.printf("Net Pay: $%.2f%n%nGoodbye.", netPay);
    }

    public static double getGrossPay(double hours, double wagePerHour){
         return hours * wagePerHour;
    }
}
