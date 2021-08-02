/*
    Design a class named MyPoint that represents a point in 2-dimensional space. Your class should contain the following:

    1. Two data fields x and y, that represent the x-coordinate and the y-coordinate of the point.
    2. Getter and setter methods for x and y.
    3. A no-arg constructor that creates a default point at (0,0).
    4. A parameterized constructor that creates a point at the designated x and y coordinate.
    5. A member method named distance that calculates and returns the distance between this MyPoint object and another point that is specified by its x- and y-coordinates. The method header looks like this:  public double distance(int xCoord, int yCoord);
    6. A member method named distance that calculates and returns the distance between this MyPoint object and another object of the MyPoint class. The method header looks like this:  public double distance(MyPoint p)
    7. A static, non-member method named distance that takes two objects of the MyPoint class as parameters, and calculates and returns the distance between the two of them. The method header looks like this:      public static double distance (MyPoint mp1, MyPoint mp2)
    8. Create a UML diagram that documents your class design.

 */

// MyPoint Class
public class MyPoint {
    // Two data fields x and y, that represent the x-coordinate
    // and the y-coordinate of the point
    private double x;
    private double y;

    /**
     * A no-arg constructor that creates a default point at (0,0).
     */
    MyPoint(){
        this(0, 0);
    }

    /**
     * MyPoint Constructor
     * A parameterized constructor that creates a point at
     * the designated x and y coordinate.
     * @param x gets the x-coordinate
     * @param y gets the y-cordinate
     */
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    /**
     * Getter and setter for x-coordinate
     * @return x
     */
    public double getX(){
        return x;
    }

    /**
     * Getter and setter for y-coordinate
     * @return y
     */
    public double getY(){
        return y;
    }

    /**
     * distance method 1
     * A member method named distance that calculates and returns the
     * distance between this MyPoint object and another point that is
     * specified by its x- and y-coordinates. The method header looks
     * like this:  public double distance(int xCoord, int yCoord);
     * @param xCoord gets the x-coordinate
     * @param yCoord gets the y-coordinate
     * @return distance
     */
    public double distance(int xCoord, int yCoord){
        return distance(new MyPoint(xCoord, yCoord));
    }

    /**
     * distance method 2
     * A member method named distance that calculates and returns the distance
     * between this MyPoint object and another object of the MyPoint class.
     * The method header looks like this: public double distance(MyPoint p)
     * @param p calculates the distance between this MyPoint object
     *          and another object of the MyPoint class
     * @return returns the distance between this MyPoint object and
     *          another object of the MyPoint class
     */
    public double distance(MyPoint p){
        return distance(this, p);
    }

    /**
     * distance method 3
     * A static, non-member method named distance that takes two objects of the
     * MyPoint class as parameters, and calculates and returns the distance
     * between the two of them. The method header looks like this:
     * public static double distance (MyPoint mp1, MyPoint mp2)
     * @param mp1 accepts an objects of the MyPoint class
     * @param mp2 accepts an objects of the MyPoint class
     * @return calculates and returns the distance between the two of objects of the MyPoint Class
     */
    public static double distance(MyPoint mp1, MyPoint mp2){
        return Math.sqrt(Math.pow(mp1.x - mp2.x, 2) + Math.pow(mp1.y - mp2.y, 2));
    }

}
