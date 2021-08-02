/*
    Write a short Java program that contains the following two methods:

     public static double celsiusToFahrenheit(double tempCelsius)

     public static double fahrenheitToCelsius(double tempFahrenheit)

    Your program should:

    1. Tell the user what the program does.
    2. Invoke the above two methods to compute and display the table below.
    3. Output a goodbye message.
*/

/*
    @author: Sunday Ogbonnaya Onwuchekwa
*/

public class W6dot2 {
    public static void main(String[] args) {
        // Tell the user what the program does.
        System.out.println("This program Invokes two methods to convert celsius to fahrenheit and vice versa\n" +
                "and display the result in a tabular form\n");

        // Create table header
        System.out.println("Celsius          Fahrenheit     |     Fahrenheit          Celsius");
        System.out.println("------------------------------------------------------------------");
        for (double tempCelsius = 40.0, tempFahrenheit = 120.0; tempCelsius >= 31.0; tempCelsius--, tempFahrenheit -= 10) {
            System.out.printf("%-17.1f", tempCelsius);
            System.out.printf("%-15.1f|%-5s", celsiusToFahrenheit(tempCelsius), " ");
            System.out.printf("%-10.1f%10s", tempFahrenheit, " ");
            System.out.printf("%-5.2f\n\n", fahrenheitToCelsius(tempFahrenheit));
        }
        System.out.println("Goodbye.");
    }

    /**
     * The celsiusToFahrenheit Method
     * Purpose: Converts celsius to fahrenheit
     * @param tempCelsius (Accept temperature in celsius)
     * @return the double value fahrenheit
     */
    public static double celsiusToFahrenheit(double tempCelsius) {
        // Converts celsius to fahrenheit
        return (tempCelsius * (9 / 5.0)) + 32;
    }

    /**
     * The fahrenheitToCelsius Method
     * Purpose: Converts fahrenheit to celsius
     * @param tempFahrenheit (Accept temperature in fahrenheit)
     * @return the double value celsius
     */
    public static double fahrenheitToCelsius(double tempFahrenheit) {
        // Converts fahrenheit to celsius
        return (5 / 9.0) * (tempFahrenheit - 32);
    }
}
