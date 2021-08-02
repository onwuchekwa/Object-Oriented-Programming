import java.util.Scanner;

/*
    For this program you will write two methods. The first computes and returns the mean value for an array of doubles.
    The method header for this method looks like this:
    public static double mean(double[ ] x);

    The second method computes and returns the standard deviation. The method header for this method looks like this:
    public static void deviation(double[ ] x);


    Now write a main( ) method that does the following:

    1. Tells the use what the program does.
    2. Prompts the user to enter five numbers.
    3. Saves the user's input in an array of doubles.
    4. Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
    5. Displays the mean and the standard deviation with 2 digits after the decimal point.
    6. Displays a goodbye message.

    @author: Sunday Ogbonnaya Onwuchekwa

 */
public class W7dot2 {
    public static void main(String[] args) {
        // Create an Array with a length of 5
        double[] numbers = new double[5];

        //Declare variable for average
        double meanOfNumbers;

        // Tells the user what the program does.
        System.out.println("This program computes the mean and the standard deviation for a set of numbers.");

        // Create a Scanner class
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter 5 double values
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter a number: ");

            // Check if input value is a number
            if (input.hasNextDouble()) {
                // Saves the user's input in an array of doubles.
                numbers[i] = input.nextDouble();
            } else {
                System.out.println("One of the values entered is invalid. The values must be a number.\nGoodbye.");
                System.exit(1);
            }
        }
        // Calls the average method you wrote to calculate and return the average value of the numbers in the array.
        meanOfNumbers = mean(numbers);

        // Displays the mean with 2 digits after the decimal point.
        System.out.printf("\nThe mean of this set of numbers is %.2f%n", meanOfNumbers);

        // Call the deviation method and pass actual parameter to it
        deviation(numbers);

        // Displays a goodbye message.
        System.out.println("Goodbye ...");
    }

    /**
     * The mean Method
     * Purpose: Compute the mean for the numbers in the array
     *
     * @param x (Accept array of numbers)
     * @return Return the mean of an array
     */
    public static double mean(double[] x) {
        double meanOfArray = 0;
        for (double i : x)
            // Compute the mean for the numbers in the array
            meanOfArray += i;
        // Return the mean of an array
        return meanOfArray / x.length;
    }

    /**
     * The deviation Method
     * Purpose: Compute the standard deviation for the numbers in the array
     *
     * @param x (Accept array of numbers)
     */
    public static void deviation(double[] x) {
        double sumDeviation = 0;
        double meanOfArray = mean(x);
        for (double i : x)
            // Compute the standard deviation for the numbers in the array
            sumDeviation += Math.pow(i - meanOfArray, 2);
        // Displays the standard deviation with 2 digits after the decimal point.
        System.out.printf("The standard deviation is %.2f%n", Math.sqrt(sumDeviation / (x.length - 1)));
    }
}
