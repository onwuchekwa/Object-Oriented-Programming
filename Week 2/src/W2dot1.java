import java.util.Scanner;

public class W2dot1 {
    public static void main(String[] args) {
        // Tells the user what the program does.
        System.out.println("This program converts a temperature in degrees Celsius into a temperature in degrees Fahrenheit.");

        // Prompts the user to enter a temperature in degrees Celsius.
        Scanner inputTemperature = new Scanner(System.in);
        System.out.println("Enter a temperature in degree Celsius: ");

        // Gets the user's input and saves it in a variable declared as a double.
        double temperatureInCelsius = inputTemperature.nextDouble();

        // Converts the Celsius temperature to a temperature in degrees Fahrenheit, using the formula:
        // tempf = (9.0/5.0) x tempc+ 32
        double temperatureInFahrenheit = (9.0 / 5.0) * temperatureInCelsius + 32;

        // Outputs the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point.
        System.out.println("\n" + temperatureInCelsius + " degrees Celsius is equal to " + temperatureInFahrenheit + " degrees Fahrenheit.");

        // Outputs a goodbye message.
        System.out.println("Goodbye.");
    }
}
