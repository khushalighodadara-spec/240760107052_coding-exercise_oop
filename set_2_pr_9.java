public class Rectangle {
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        // Create Rectangle objects
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        // Display details of Rectangle 1
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + rect1.width);
        System.out.println("Height = " + rect1.height);
        System.out.println("Area = " + rect1.getArea());
        System.out.println("Perimeter = " + rect1.getPerimeter());

        System.out.println();

        // Display details of Rectangle 2
        System.out.println("Rectangle 2:");
        System.out.println("Width = " + rect2.width);
        System.out.println("Height = " + rect2.height);
        System.out.println("Area = " + rect2.getArea());
        System.out.println("Perimeter = " + rect2.getPerimeter());

        System.out.println();

        // Compare areas
        if (rect1.getArea() > rect2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (rect2.getArea() > rect1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }

        /*
        Output:
        Rectangle 1:
        Width = 4.0
        Height = 40.0
        Area = 160.0
        Perimeter = 88.0

        Rectangle 2:
        Width = 3.5
        Height = 35.9
        Area = 125.65
        Perimeter = 78.8

        Rectangle 1 has a larger area.
        */
    }
}
