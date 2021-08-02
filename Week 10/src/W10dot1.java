/**
 * @author: Sunday Ogbonnaya Onwuchekwa
 */

import java.util.ArrayList;
import java.util.Scanner;

public class W10dot1 {
    public static void main(String[] args) {
        /** Create Variables */
        double side1 = 0, side2 = 0, side3 = 0, sides = 3;
        String color = "", response = "";
        boolean filled = true;

        /** Tells the user what the program does. */
        System.out.println("This program gets input for three triangles from the user.\n" +
                "It then creates three Triangle objects and displays the\n" +
                "description of each.");

        /** Prompts the user to enter the values for the sides, color,
            and filled attribute for three different triangle objects. */
        Scanner input = new Scanner(System.in);

        ArrayList<GeometricObject> geometricObjectArrayList = new ArrayList<GeometricObject>();

        for(double i = 1; i <= sides; i++) {
            /** Get input values of the color */
            System.out.print("Enter the color of a triangle (e.g. \"red\"): ");
            color = input.next();

            /** Get input for filled value */
            System.out.print("Is the triangle filled (y or n): ");
            response = input.next().toLowerCase();
            if(response.equals("y"))
                filled = true;
            else if(response.equals("n"))
                filled = false;
            else {
                System.out.println("Invalid filled value. It must either be a 'y' or 'n'.\nGoodbye...");
                System.exit(1);
            }

            /** Get input values of the three sides */
            System.out.print("Enter the lengths of the three sides of the triangle: ");

            /** Saves the users input. */
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();

            /** Using the values entered by the user, creates three Triangle objects and
                    stores them in an ArrayList<GeometricObject>. */
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setFilled(filled);
            triangle.setColor(color);

            geometricObjectArrayList.add(triangle);
        }

        /** Loop the Geometric List */
        for (GeometricObject geometricObject : geometricObjectArrayList) {
            /** Displays the string representation of each Triangle object in the ArrayList,
                    by calling its toString() method  and its getArea() method. See the output
                    example below. */
            System.out.println(geometricObject.toString());
            System.out.printf("Area = %.2f%n", geometricObject.getArea());
        }
        /** Displays a goodbye message. */
        System.out.println("\nGoodbye...");
    }
}
