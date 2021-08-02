/*
    Write a short Java program that does the following:
    1. Tells the user what the program does.
    2. Prompts the user to enter a hexadecimal digit.
    3. Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
    4. Converts the hexadecimal digit into a four digit binary number.
    5. Outputs the four digit binary number, including any leading zeros.
    6. Outputs a goodbye message.
*/

/*
    @author: Sunday Ogbonnaya Onwuchekwa
*/

import java.util.Scanner;

public class W4dot1 {
    public static void main(String[] args) {
        //Tells the user what the program does.
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");

        //Create an object of the Scanner Class
        Scanner input = new Scanner(System.in);

        //Prompts the user to enter a hexadecimal digit.
        System.out.print("Enter a hexadecimal number: ");

        //Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user
        // and terminate the program.
        String hexDigit = input.next();

        //Check the character length
        if (hexDigit.length() != 1) {
            System.out.println("You must enter only one character.");
            System.exit(1);
        }

        //Regular expression that matches string containing digits [0-9] and alphabets [A-F] or [a-f]
        String hexPattern = "^[0-9A-Fa-f]+$";
        if (!hexDigit.matches(hexPattern)) {
            System.out.println(hexDigit.toUpperCase() + " is not a valid hexadecimal digit.\nGoodbye.");
            System.exit(1);
        }

        //Convert a hexadecimal to a decimal
        int decimalNumber = Integer.parseInt(hexDigit.toUpperCase(), 16);

        //Outputs the four digit binary number, including any leading zeros.
        //Outputs a goodbye message.
        System.out.printf("\nThe binary value is %04d.\nGoodbye.", Integer.parseInt(convertToBinary(decimalNumber)));
    }

    public static String convertToBinary(int decimalNumber) {
        //Converts the hexadecimal digit into a four digit binary number.
        return Integer.toBinaryString(decimalNumber);
    }
}
