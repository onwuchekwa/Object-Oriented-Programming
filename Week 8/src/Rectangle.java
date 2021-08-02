public class Rectangle {
    /*
        Declare Two data fields named width and height, that specify the
        width and height of the rectangle.
    */
    double width, height;

    // A no-arg constructor that creates a default rectangle object.
    public Rectangle(){
        // The default values for both width and height should be 1
        width = 1;
        height = 1;
    }

    // A parameterized constructor that creates a rectangle object with the
    // specified height and width.
    public Rectangle(double newWidth, double newHeight) {
        // Getter and setter methods for height and width.
        width = newWidth;
        height = newHeight;
    }

    /**
     * The getArea Method
     * Purpose: Computes the area of the rectangle.
     * @return returns the area of the rectangle
     */
    public double getArea(){
        return width * height;
    }

    /**
     * The getPerimeter Method
     * Purpose: Computes the perimeter of the rectangle
     * @return returns the perimeter of the rectangle
     */
    public double getPerimeter(){
        return (2 * width) + (2 * height);
    }
}
