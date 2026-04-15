public class Rectangle {
    double width = 1.0;
    double height = 1.0;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
     public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.0, 3.0);

        System.out.println("Rectangle 1:");
        System.out.println("Width = " + rect1.width);
        System.out.println("Height = " + rect1.height);
        System.out.println("Area = " + rect1.getArea());
        System.out.println("Perimeter = " + rect1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width = " + rect2.width);
        System.out.println("Height = " + rect2.height);
        System.out.println("Area = " + rect2.getArea());
        System.out.println("Perimeter = " + rect2.getPerimeter());
    }
}
//output
//Rectangle 1:
//Width = 1.0
//Height = 1.0
//Area = 1.0
//Perimeter = 4.0

//Rectangle 2:
//Width = 5.0
//Height = 3.0
//Area = 15.0
//Perimeter = 16.0
