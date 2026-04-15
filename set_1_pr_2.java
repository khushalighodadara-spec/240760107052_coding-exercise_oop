import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        
        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

       
        if (D == 0) {
            System.out.println("The system has no unique solution because D = 0.");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }

        scanner.close();
    }
}
//output
//Enter a: 2
//Enter b: 3
//Enter c: 1
//Enter d: 2
//Enter e: 8
//Enter f: 5

//x = 1.00
//y = 2.00
