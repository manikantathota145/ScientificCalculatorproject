import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();
                result = num1 + num2;
                break;
            case 2:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                break;
            case 3:
                System.out.println("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                break;
            case 4:
                System.out.println("Enter dividend: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter divisor: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case 5:
                System.out.println("Enter number: ");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                } else {
                    System.out.println("Cannot calculate square root of a negative number.");
                }
                break;
            case 6:
                System.out.println("Enter base: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter exponent: ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}
