class Shape {
    double d1, d2;
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}
class Triangle extends Shape {
    double calculateArea() {
        return 0.5 * d1 * d2;
    }
}
class Rectangle extends Shape {
    double calculateArea() {
        return d1 * d2;
    }
}

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.getData(10, 5); // base and height
        System.out.println("Area of Triangle: " + triangle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.getData(8, 4); // length and breadth
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}

/*
Output:
Area of Triangle: 25.0
Area of Rectangle: 32.0
*/
