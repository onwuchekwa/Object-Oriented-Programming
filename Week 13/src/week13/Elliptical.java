package week13;

public class Elliptical extends MachineObject {

    public Elliptical() {
        super();
    }

    public Elliptical(double met, int timeSpend, double weight ) {
        super(met, timeSpend, weight);
    }

    public double getMet() {
        return super.getMet();
    }

    public double getWeight() {
        return super.getWeight();
    }

    public int getTimeSpend() {
        return super.getTimeSpend();
    }

    public double getCaloriesBurned() {
        return super.getCaloriesBurned();
    }

    public String toString() {
        return "dated " + super.getDateCreated() +
                "\nUser Weight = " + super.getWeight() + "kg" +
                "\nTime Spend in Minutes = " + super.getTimeSpend() + " minutes" +
                "\nMetabolic Equivalent for Task (MET) = " + super.getMet();
    }
}
