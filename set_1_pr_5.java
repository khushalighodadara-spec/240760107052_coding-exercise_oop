import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Area of the triangle: %.2f%n", area);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }
          scanner.close();
    }
}
//output
//Enter side a: 3
//Enter side b: 4
//Enter side c: 5
//Area of the triangle: 6.00
