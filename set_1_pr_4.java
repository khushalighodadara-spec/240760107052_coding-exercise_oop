import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double bmi = kilograms / (meters * meters);
        System.out.printf("Your BMI is: %.2f%n", bmi);

        scanner.close();
    }
}
//output
//Enter weight in pounds: 150
//Enter height in inches: 68
//Your BMI is: 22.80
