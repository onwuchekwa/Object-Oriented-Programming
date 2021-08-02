public class W8dot1 {
    public static void main(String[] args){
        System.out.println("This program creates two rectangle objects and displays their width, height, area and perimeter.\n");
        // Creates two Rectangle objects, the first with a height of 4 and
        // a width of 40, the second with a height of 3.5 and a width of 5.
        Rectangle rectangle1 = new Rectangle(40, 4);
        Rectangle rectangle2 = new Rectangle(5, 3.5);

        // Call the methods in your Rectangle class to output the width,
        // height, area, and perimeter of each rectangle, with 2 digits
        // after the decimal point.
        System.out.println("Rectangle 1:");
        System.out.printf("height = %.2f%n", rectangle1.height);
        System.out.printf("width = %.2f%n", rectangle1.width);
        System.out.printf("area = %.2f%n", rectangle1.getArea());
        System.out.printf("perimeter = %.2f%n%n", rectangle1.getPerimeter());

        System.out.println("Rectangle 2:");
        System.out.printf("height = %.2f%n", rectangle2.height);
        System.out.printf("width = %.2f%n", rectangle2.width);
        System.out.printf("area = %.2f%n", rectangle2.getArea());
        System.out.printf("perimeter = %.2f%n%n", rectangle2.getPerimeter());
        // Output a goodbye message
        System.out.println("Goodbye ...");
    }
}
