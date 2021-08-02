import java.util.Scanner;

public class W2dot2 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("Given the price of a meal and a percentage to use for the tip, \n" +
                " this program calculates the tip, the tax, and the total amount of the bill.");

        // Prompts the user to enter a value for the cost of their meal.
        Scanner inputCost = new Scanner(System.in);
        System.out.println("Enter the cost of the meal: ");

        // Gets the user's input and saves it in a variable declared as a double.
        double costOfMeal = inputCost.nextDouble();

        // Prompts the user to enter a percentage value for the tip.
        System.out.println("Enter the tip percentage: ");

        // Gets the user's input and saves it in a variable declared as a double.
        double percentageCost = inputCost.nextDouble();

        // Calculates the value of the tip, using the percentage entered by the user.
        double tip = costOfMeal * (percentageCost / 100.0);

        // Calculates the tax on the meal. The tax rate is 3.2%.
        double tax = costOfMeal * (3.2 / 100);

        // Calculates the total bill = meal cost + tip + tax.
        double totalBill = costOfMeal + tip + tax;

        // Outputs the tip, the tax, and the total value of the bill. All values will be formatted to show a dollar sign
        // and 2 digits after the decimal point.
        //System.out.println("\nThe tip is $" + String.format("%.2f", Math.round(tip * 100.0) / 100.0));
        System.out.format("The tip is $%.2f%n", (tip * 100.0) / 100.0);
        System.out.format("The tax is $%.2f%n", (tax * 100.0) / 100.0);
        System.out.format("The total bill is  $%.2f%n", (totalBill * 100.0) / 100.0);

        // Outputs a goodbye message.
        System.out.println("Goodbye.");
    }
}
