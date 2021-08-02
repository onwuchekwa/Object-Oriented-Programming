/*
    Write a Java program that does the following:

    1. Tells the user what the program does.
    2. Asks the user to enter in 10 integer values. If a non-integer value is entered, your program should display an error message and re-prompt the user to enter that value.
    3. Stores the user's input in an array of integers.
    4. Opens a file named data.txt. If the file does not exist, your program should create it. If the file cannot be opened, an error message is displayed and the program terminates.
    5. Writes the ten integer values entered by the user to the file. Write each integer value on a separate line.
    6. Closes the file.
    7. Opens the file. If the file cannot be opened, an error message is displayed and the program terminates.
    8. Reads the data back in from the file and sums the values as the data is read in.  An error message is displayed if there is an error reading the data, and the program is terminated.
    9. Computes and displays the average value of the numbers in the file. Show the average with two digits after the decimal point.
    10. Displays a goodbye message.

    @author: Sunday Ogbonnaya Onwuchekwa
 */

import java.util.*;
import java.io.*;
public class W11dot1 {
    public static void main(String[] args) {
        /* Array of Integers */
        int[] numbers = new int[10];

        /* Variable for checking number of count */
        int count = 0, enteredValue;

        /* Tell the user what the program does */
        System.out.println("This program gets ten numbers from the user, and\n" +
                "computes and displays the average.");

        /* Create a Scanner Class */
        Scanner input = new Scanner(System.in);

        /* Asks the user to enter in 10 integer values. If a non-integer
            value is entered, your program should display an error message
            and re-prompt the user to enter that value.  */

        System.out.println("\nPlease enter ten integer values.");
        while (count < 10) {
            /* If a non-integer value is entered, your program should display an error message
                and re-prompt the user to enter that value. */
            try {
                /* Asks the user to enter in 10 integer values */
                System.out.println("Please Integer " + (count + 1) + ": ");
                String inputValue = input.next();
                enteredValue = Integer.parseInt(inputValue);
                /* Stores the user's input in an array of integers. */
                numbers[count] = enteredValue;
                count++;
            } catch (NumberFormatException e) {
                /* If a non-integer value is entered, your program should display an error message */
                System.out.println("Error: input must be an integer.");
            }
        }

        /* Show the average with two digits after the decimal point. */
        System.out.printf("The average of the input values is %.2f%n", getAverage(writeToFile(numbers)));

        /* Displays a goodbye message. */
        System.out.println("Goodbye...");
    }

    /***
     * The writeToFile Method
     * Purpose: This get the array of integers, create a new text file and write to it
     * @param integerArray An array of integers received from Users
     * @return a file (data.txt)
     */
    public static File writeToFile(int[] integerArray) {
        /* Opens a file named data.txt. If the file does not exist, your program should create it.
            If the file cannot be opened, an error message is displayed and the program terminates. */
        File file = new File("data.txt");

        try (PrintWriter outfile = new PrintWriter(file)) {
            /* Writes the ten integer values entered by the user to the file.
                Write each integer value on a separate line */
            for(int i : integerArray)
                outfile.println(i);
        } catch (IOException e) {
            /* Opens the file. If the file cannot be opened, an error message is displayed and the program terminates. */
            System.out.println("Error: Unable to write data to file");
        }
        return file;
    }

    /***
     * The getAverage Method
     * Purpose: This method accepts a file, read it contents, and calculate its average value
     * @param file A file containing an array of integers
     * @return average
     */
    public static double getAverage(File file) {
        /* Reads the data back in from the file and sums the values as the data is read in.
            An error message is displayed if there is an error reading the data,
            and the program is terminated. */
        File fileAverage = new File(String.valueOf(file));

        double totalValue = 0, count = 0;
        try (Scanner input = new Scanner(fileAverage)) {
            while(input.hasNextLine()) {
                String line = input.nextLine().trim();
                totalValue += Integer.parseInt(line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read data from file");
        }

        /* Computes and displays the average value of the numbers in the file. */
        return totalValue / count;
    }
}
