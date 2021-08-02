/*
    Write a short Java program that does the following:

    1. Tells the user what the program does.
    2. Prompts the user to an investment amount, for example, 1000.
    3. Gets the user's input and saves it. The user's input must be a positive, non-zero value.
    4. Prompts the user to enter an annual interest rate, for example, 9%.
    5. Gets the user's input and saves it. The user's input must be positive and less than 100.
    6. Using a method that you have written, calculate and display the future value of the investment
      for a period of 10 years.
    7. The formula for computing the future value of an investment is:
            * futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12
     8. The method header for your method should look like this:
            * public static double futureValue(double investmentAmount, double monthlyInterestRate, int years)
*/

/*
    * @author Sunday Ogbonnaya Onwuchekwa
*/

import java.util.Scanner;

public class W6dot1 {
    public static void main(String[] args){
        // Declare variables to store data that will be used by the program
        double investmentAmount, annualInterest, monthlyInterest;
        final int NO_OF_YEARS = 10;

        // Tell the user what the program does
        System.out.println("Given an investment amount and an annual interest rate,\n" +
                "this program will calculate the future value of the investment for a\n" +
                "period of ten years\n");

        // Prompt the user to input an investment amount
        investmentAmount = promptForInput("Enter a positive, non-zero value for the investment: ");

        // Check if user's input is a positive, non-zero value
        if (investmentAmount < 1) {
            System.out.println(investmentAmount + " is invalid. Investment amount must be greater than zero (0).\nGoodbye.");
            System.exit(1);
        }

        // Prompt the user to input an annual interest
        annualInterest = promptForInput("Enter an annual interest rate, between 0 and 100: ");

        // Check if user's input is between 0 and 100
        if (annualInterest < 0 || annualInterest > 100) {
            System.out.println(annualInterest + "% is invalid. Annual interest rate must be between 0 and 100.\nGoodbye.");
            System.exit(1);
        }

        // Convert annual interest rate to monthly interest rate
        monthlyInterest = (annualInterest / 100) / 12;

        // Create White Space
        System.out.println();

        // Display the report header
        System.out.println("Years      Future Value");

        // Iterate through the years and display result
        for (int years = 1; years <= NO_OF_YEARS; years++) {
            // Call the getFutureInvestmentValue
            System.out.printf("%-11d$%6.2f%n", years, getFutureInvestmentValue(investmentAmount, monthlyInterest, years));
        }

        // Display a goodbye message
        System.out.println("\nGoodbye ...");
    }

    /**
     * The promptForInput Method
     * Purpose: Prompt the user and get a double value
     * @param prompt (The user prompt as a String)
     * @return the double value entered by the user
     */
    public static double promptForInput(String prompt) {
        // Declare a variable to store user input
        double userInput = 0;

        // Create a Scanner class to accept user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an investment amount
        System.out.print(prompt);

        if(input.hasNextDouble()) {
            //Get user's input (annual interest) and save it
            userInput = input.nextDouble();
        } else {
            System.out.println("Data entered is invalid. The value must be a number.\nGoodbye.");
            System.exit(1);
        }

        return userInput;
    }

    /**
     * The getFutureInvestmentValue Method
     * Purpose: calculate the future value of the investment for a period of ten years
     * @param investmentAmount (The amount invested by user)
     * @param monthlyInterestRate (Monthly interest rate on the investment)
     * @param numberOfYears (Number of years invested)
     */

    public static double getFutureInvestmentValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        // Calculate the future value of the investment
        return Math.round(investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12) * 100) / 100.0;
    }
}
