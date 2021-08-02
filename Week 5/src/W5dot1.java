/*
    Write a short Java program that does the following:

    1. Tells the user what the program does.
    2. Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the table below.
    3. Outputs a goodbye message.

 */

/*
    @author: Sunday Ogbonnaya Onwuchekwa
 */

public class W5dot1 {
    public static void main(String[] args) {
        // Create a constant variable for converting pounds to kilometer
        final double POUNDS_PER_KILOGRAM = 2.2;

        // Tells the user what the program does
        System.out.println("This program calculates pounds per kilogram (1 kilogram = 2.2 pounds) and display the table below\n");

        System.out.println("Kilograms          Pounds");
        System.out.println("---------          ------");

        //Uses a loop to calculate pounds per kilogram (1 kilogram = 2.2 pounds) and display the table below.
        for (int i = 1; i < 16; i++) {
            if(i % 2 == 1)
                System.out.printf("%-18d%6.1f%n", i, i * POUNDS_PER_KILOGRAM);
        }
        //Outputs a goodbye message.
        System.out.println("\nGoodbye.");
    }
}
