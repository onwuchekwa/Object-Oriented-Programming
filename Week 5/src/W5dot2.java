/*
    Write a short Java program that does the following:

    1. Tells the user what the program does.
    2. Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
        The numbers will be separated by exactly one space and there will 10 numbers per line.
    3. Displays a goodbye message.

 */

/*
    @author: Sunday Ogbonnaya Onwuchekwa
 */


public class W5dot2 {
    public static void main(String[] args) {
        // Constant for maximum number per line
        final double LINE_LIMIT = 10;

        // Initialize lineCount to count the iteration
        int lineCount = 0;

        // Tells the user what the program does.
        System.out.println("This program displays all of the numbers from 100 to 1000\n" +
                "that are divisible by both 5 and 6.\n");

        /*
            Uses a loop to display a table of all of the numbers from 100 to 1000 that are divisible by both 5 and 6.
            The numbers will be separated by exactly one space and there will 10 numbers per line.
         */
        for(int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0){
                lineCount++;
                if(lineCount % LINE_LIMIT != 0)
                    System.out.print(i + " ");
                else
                    System.out.println(i);
            }
        }

        //Outputs a goodbye message.
        System.out.println("\nGoodbye.");
    }
}
