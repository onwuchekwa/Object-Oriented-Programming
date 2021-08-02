package week13;

import java.util.Date;

public class MachineObject {
    private double met;
    private int timeSpend;
    private double weight;
    private Date dateCreated;

    /* Default constructor */
    public MachineObject() {
        dateCreated = new java.util.Date();
    }

    /* Parameterized constructor */
    public MachineObject(double met, int timeSpend, double weight) {
        dateCreated = new java.util.Date();
        this.met = met;
        this.timeSpend = timeSpend;
        this.weight = weight;
    }

    /* Return Met Value */
    public double getMet() {
        return met;
    }

    /* Return Time Spend Value */
    public int getTimeSpend() {
        return timeSpend;
    }

    /* Return Weight Value */
    public double getWeight() {
        return weight;
    }

    /* Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /* Calculates the calories burned for each machine object */
    public double getCaloriesBurned() {
        double caloriesBurnedPerMin = (met * weight * 3.5) / 200;
        return caloriesBurnedPerMin * timeSpend;
    }

    /* Return a string representation of this object */
    public String toString() {
        return "dated " + dateCreated + "\n User Weight = " + weight + "kg" +
                "\nTime Spend in Minutes = " + timeSpend + " minutes" +
                "\nMetabolic Equivalent for Task (MET) = " + met;
    }
}
