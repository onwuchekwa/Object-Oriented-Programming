/*
    In a separate file, write a main( ) method that does the following:

    1. Tells the user what the program does.
    2. Uses the no-arg constructor to create a MyPoint object p1 at (0,0).
    3. Prompts the user to enter the x and y coordinates of a point.
    4. Saves the users input.
    5. Uses the first distance method to calculate and display the distance between the MyPoint object p1 and the point at the x and y coordinates entered by the user. The distance is displayed with two digits after the decimal point.
    6. Uses the parameterized constructor to create a MyPoint object p2 using the x coordinate and y coodinate entered  by the user.
    7. Uses the second and third distance method to calculate and display the distance between the MyPoint object p1 and the MyPoint object p2.  The distance is displayed with two digits after the decimal point.
    8. Displays a goodbye message.

    @author: Sunday Ogbonnaya Onwuchekwa
 */

import java.util.Scanner;

public class W9dot1 {
    public static void main(String[] args) {
        // Declare variables for x and y coordinates
        int x, y;

        // Tells the user what the program does
        System.out.println("This program creates a point at (0,0) and a point at the coordinates\n" +
                "entered by you. It then computes and displays the distance from (0,0)\n" +
                "to the point defined by you, using three different methods.");

        // Create the Scanner Class
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the x coordinates of a point.
        System.out.print("Enter the x coordinate of a point: ");
        x = input.nextInt();

        // Prompts the user to enter the y coordinates of a point.
        System.out.print("Enter the y coordinate of a point: ");
        y = input.nextInt();

        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(x, y);

        // Display the distance between point1 and point2
        /*
            Uses the first distance method to calculate and display the
            distance between the MyPoint object p1 and the point at the x and y
            coordinates entered by the user. The distance is displayed with two
            digits after the decimal point.
         */
        System.out.format("Using method 1, the distance from (0, 0) to (%d, %d) is %.2f%n", x, y, myPoint1.distance(x, y));

        /*
            Uses the parameterized constructor to create a MyPoint object p2
            using the x coordinate and y coodinate entered  by the user.
         */
        System.out.format("Using method 2, the distance from (0, 0) to (%d, %d) is %.2f%n", x, y, myPoint1.distance(myPoint2));

        /*
            Uses the second and third distance method to calculate and display the
            distance between the MyPoint object p1 and the MyPoint object p2.
            The distance is displayed with two digits after the decimal point.
         */
        System.out.format("Using method 3, the distance from (0, 0) to (%d, %d) is %.2f%n", x, y, MyPoint.distance(myPoint1, myPoint2));

        // Displays a goodbye message.
        System.out.println("Goodbye...");
    }
}
