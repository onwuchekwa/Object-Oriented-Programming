/*
    Write a method that calculates and returns the average value for an array of doubles. The method header will look like the following:

    public static double average(double[ ] array)

    Then write a main( ) method that does the following:

    1. Tells the user what the program does.
    2. Prompts the user to enter 5 double values.
    3. Stores these values in an array.
    4. Calls the average method you wrote to calculate and return the average value of the numbers in the array.
    5. Displays the average value, with two digits after the decimal point.
    6. Displays a goodbye message.

    @author: Sunday Ogbonnaya Onwuchekwa

 */

import java.util.Scanner;

public class W7dot1 {
    public static void main(String[] args){
        // Create an Array with a length of 5
        double[] numbers = new double[5];

        //Declare variable for average
        double averageOfArrayNumbers;

        // Tells the user what the program does.
        System.out.println("This program calculates the average of five numbers.");

        // Create a Scanner class
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter 5 double values
        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");

            // Check if input value is a number
            if(input.hasNextDouble()) {
                // Stores these values in an array.
                numbers[i] = input.nextDouble();
            } else {
                System.out.println("One of the values entered is invalid. The values must be a number.\nGoodbye.");
                System.exit(1);
            }
        }
        // Calls the average method you wrote to calculate and return the average value of the numbers in the array.
        averageOfArrayNumbers = average(numbers);

        // Displays the average value, with two digits after the decimal point.
        System.out.printf("The average of these five numbers is %.2f%n", averageOfArrayNumbers);

        // Displays a goodbye message.
        System.out.println("Goodbye.");
    }

    /**
     * The average Method
     * Purpose: Calculate the average value of numbers in the array
     * @param array Accept array of numbers
     * @return average (sum / array.length)
     */
    public static double average(double[ ] array) {
        double sum = 0;
        for(double i : array)
            // Calculate the sum of the value of numbers in the array
            sum += i;
        // Return the average of an array
        return sum / array.length;
    }
}
