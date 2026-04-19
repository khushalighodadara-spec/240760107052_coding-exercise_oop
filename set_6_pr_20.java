public class DivisionDemo {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Please provide numerator and denominator.");
                return;
            }
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            int result = numerator / denominator;

            System.out.println("Result = " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integer values only.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error! Denominator cannot be zero.");
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}

/*
Sample Outputs:

1) Command:
   java DivisionDemo 10 2
   Output:
   Result = 5

2) Command:
   java DivisionDemo 10 0
   Output:
   Error! Denominator cannot be zero.

3) Command:
   java DivisionDemo 10 abc
   Output:
   Invalid input! Please enter integer values only.

4) Command:
   java DivisionDemo 10
   Output:
   Please provide numerator and denominator.
*/
