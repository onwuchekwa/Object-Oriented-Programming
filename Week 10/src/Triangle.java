/** Design a class named Triangle that extends the GeometricObject */
public class Triangle extends GeometricObject {
    /** Three data fields side1, side2, and side3 that represent sides
            of a triangle. */
    private double side1;
    private double side2;
    private double side3;

    /** A no-arg constructor that creates a default triangle with
            each side equal to 1 */
    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    /** A parameterized constructor that creates a triangle with the
            specified values for side1, side2, and side3 */
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /** Getter method for side1 */
    public double getSide1() {
        return side1;
    }

    /** Getter method for side2 */
    public double getSide2() {
        return side2;
    }

    /** Getter method for side3 */
    public double getSide3() {
        return side3;
    }

    /** A member method named getArea( ) that calculates and returns
            the area of the triangle */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /** Return a string description for the triangle */
    public String toString() {
        return "\nTriangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 +
                "\ncreated on " + super.getDateCreated() +
                "\ncolor: " + super.getColor() + " and filled = " + super.isFilled();
    }
}
