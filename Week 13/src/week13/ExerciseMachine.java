/*
    ExerciseMachine allows unauthenticated users to use various types of gym equipment to keep fit and check the number of calories burned.
    The users will choose equipment of choice, add the time they spend using the equipment, and their weight prior to using the equipment.
    The system will then create a MET (Metabolic equivalent for the task) according to the equipment selected and generate the number of calories burned.

    * @Author 1: Camila Romero
    * @Author 2: Sunday Onwuchekwa
*/

package week13;

import java.io.*;
import java.util.*;

public class ExerciseMachine {
    public static void main(String[] args) {
        /* Create an array of String to hold user data */
        Object[] userData = new Object[5];

        /* Create a scanner object to accept input */
        Scanner input = new Scanner(System.in);

        /* Declare variables */
        int timeSpend;
        boolean machineSelector;
        String userName, machineName = "", validName;
        double met = 0, weight;

        /* Tell the user what the program does */
        System.out.println("*************************************************************************************************************");
        System.out.println("  This program, 'ExerciseMachine,' calculates the number of calories burned using a selected gym equipment.  ");
        System.out.println("                               Developed by Camila Romero & Sunday Onwuchekwa                                ");
        System.out.println("                            CIT 260 - Object-Oriented Programming - winter 2020                              ");
        System.out.println("                                    Brigham Young University – Idaho                                         ");
        System.out.println("*************************************************************************************************************");
        System.out.println();

        /* Ask the user for their name */
        do {
            validName = "^[\\p{L} .'-]+$";
            System.out.print("Enter your name: ");
            userName = input.nextLine();
            if(!userName.matches(validName))
                System.out.println("Your name is invalid. It contains an invalid character or a number!");
        } while (!userName.matches(validName));

        /* Ask user to select the type of machine */
        System.out.println("=====================================================");
        System.out.println("    ---- Select a Gym Equipment (1, 2, or 3) ----    ");
        System.out.println("=====================================================");
        System.out.println( "1:     Elliptical\n" +
                "2:     Stationary Bike\n" +
                "3:     Treadmill\n" +
                "====================================================="
        );

        /* Loop to check if valid option is selected */
        do {
            /* Set Machine Selector to false */
            machineSelector = false;

            switch ( input.nextInt()){
                case 1:
                    met = 5.0;
                    machineName = "Elliptical";
                    break;
                case 2:
                    met = 5.8;
                    machineName = "Stationary Bike";
                    break;
                case 3:
                    met = 2.3;
                    machineName = "Treadmill";
                    break;
                default:
                    System.out.println("Select Option 1, 2, or 3");
                    machineSelector = true;
            }

        } while (machineSelector);

        /* Ask the user for their weight in Kilograms (kg) */
        do {
            System.out.print("Enter your weight (in Kilogram): ");
            weight = input.nextDouble();
            if(weight < 1)
                System.out.println("Your weight must be greater than zero!");
        } while (weight < 1);

        /* Ask the user for the time they spend using the equipment */
        do {
            System.out.print("Enter the number of minutes spend using the equipment (in minutes): ");
            timeSpend = input.nextInt();
            if(timeSpend < 1)
                System.out.println("Your time spend must be greater than zero!");
        } while (timeSpend < 1);

        /* Append values supplied by users to an array */
        userData[0] = userName;
        userData[1] = machineName;
        userData[2] = met;
        userData[3] = weight;
        userData[4] = timeSpend;

        /* Pass the writeToFile Method to a variable */
        File writeUserData = writeToFile(userData);
        /* Pass the writeToObject method to a variable */
        Object[] getUserData = writeToObject(writeUserData);

        /* Call the displayReport method to print report to user */
        displayResult(getUserData);
        /* Print a goodbye message */
        System.out.println("\nGoodbye...");
    }

    /**
     * The writeToFile Method
     * Purpose: This gets the array consisting of member's data, creates a new text file and writes to it
     * @param userData An array of object to written to a file
     * @return a file (exercise_data.txt)
     */
    public static File writeToFile(Object[] userData) {
        /* Opens a file named exercise_data.txt. If the file does not exist, your program should create it.
            If the file cannot be opened, an error message is displayed and the program terminates. */
        File file = new File("exercise_data.txt");

        try (PrintWriter outfile = new PrintWriter(file)) {
            /* Writes the user data to the file. Write each data on a separate line */
            for(Object i : userData)
                outfile.println(i);
        } catch (IOException e) {
            /* Opens the file. If the file cannot be opened, an error message is displayed and the program terminates. */
            System.out.println("Error: Unable to write data to file");
        }
        return file;
    }

    /**
     * The writeToObject Method
     * Purpose: This reads a file, and writes user's data to an object array
     * @param file A file containing user's data
     * @return dataFromFile
     */
    public static Object[] writeToObject(File file) {
        /* Create an object array to hold data from file */
        Object[] dataFromFile = new Object[5];

        /* Reads the data back in from the file and write to an array of objects. */
        File fileUserData = new File(String.valueOf(file));

        /* variable to check array location */
        int counter = 0;
        /* append user's data to an array */
        try (Scanner input = new Scanner(fileUserData)) {
            while(input.hasNextLine()) {
                String line = input.nextLine().trim();
                dataFromFile[counter] = line;
                /* Increment counter */
                counter++;
            }
        } catch (IOException e) {
            System.out.println("Error: Unable to read data from file");
        }
        return dataFromFile;
    }

    /**
     * The displayResult Method
     * Purpose: Gets User's data from an array, adds the data to an ArrayList, and display the calories burned
     * @param dataFromFile An array of Object containing member's data
     */
    public static void displayResult(Object[] dataFromFile) {
        /* Initialize and Parse variables */
        String nameOfUser = (String)dataFromFile[0], machine = (String)dataFromFile[1], timeUsed = (String) dataFromFile[4],
                userWeight = (String)dataFromFile[3], machineMet = (String)dataFromFile[2];
        int time = Integer.parseInt(timeUsed);
        double weight = Double.parseDouble(userWeight), met = Double.parseDouble(machineMet);

        /* Create an ArrayList object */
        ArrayList<MachineObject> machineObjectArrayList = new ArrayList<>();

        /* Using the values entered by the user, creates an object and stores it in an ArrayList<MachineObject>. */
        switch (machine) {
            case "Elliptical":
                Elliptical elliptical = new Elliptical(met, time, weight);
                machineObjectArrayList.add(elliptical);
                break;
            case "Stationary Bike":
                StationaryBike stationaryBike = new StationaryBike(met, time, weight);
                machineObjectArrayList.add(stationaryBike);
                break;
            case "Treadmill":
                Treadmill treadmill = new Treadmill(met, time, weight);
                machineObjectArrayList.add(treadmill);
                break;
            default:
                break;
        }

        /* Loop the Machine Object List */
        for(MachineObject machineObject : machineObjectArrayList){
            /* Displays the string representation of the object in the ArrayList,
               by calling its toString() method  and its getCaloriesBurned() method. */
            System.out.println("\nReport on " + nameOfUser + "'s Usage of " + machine);
            System.out.println(machineObject.toString());
            System.out.printf("Calories Burned = %.2f%n", machineObject.getCaloriesBurned());
        }
    }
}
