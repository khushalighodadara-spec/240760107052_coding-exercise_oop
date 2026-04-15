public class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10, 20);
        Point p3 = new Point(p2);
        p1.display();
        p2.display();
        p3.display();

        /*
        Sample Output:
        Point coordinates: (5, 5)
        Point coordinates: (10, 20)
        Point coordinates: (10, 20)
        */
    }
}
