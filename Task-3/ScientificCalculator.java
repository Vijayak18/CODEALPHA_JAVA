import java.util.Scanner;
import java.lang.Math;

class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Sine (sin)");
            System.out.println("8. Cosine (cos)");
            System.out.println("9. Tangent (tan)");
            System.out.println("10. Percentage");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    double diff = num1 - num2;
                    System.out.println("Result: " + diff);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    double product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        double division = num1 / num2;
                        System.out.println("Result: " + division);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 >= 0) {
                        double sqrt = Math.sqrt(num1);
                        System.out.println("Square Root: " + sqrt);
                    } else {
                        System.out.println("Square root of a negative number is not allowed.");
                    }
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextDouble();
                    double exponentiation = Math.pow(num1, num2);
                    System.out.println("Result: " + exponentiation);
                    break;
                    case 7:
                    // Sine (sin)
                    System.out.print("Enter the angle in degrees: ");
                    double angle = scanner.nextDouble();
                    double sinValue = Math.sin(Math.toRadians(angle));
                    System.out.println("Sine(" + angle + " degrees) = " + sinValue);
                    break;
                case 8:
                    // Cosine (cos)
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    double cosValue = Math.cos(Math.toRadians(angle));
                    System.out.println("Cosine(" + angle + " degrees) = " + cosValue);
                    break;
                case 9:
                    // Tangent (tan)
                    System.out.print("Enter the angle in degrees: ");
                    angle = scanner.nextDouble();
                    double tanValue = Math.tan(Math.toRadians(angle));
                    System.out.println("Tangent(" + angle + " degrees) = " + tanValue);
                    break;
                case 10:
                    // Percentage
                    System.out.print("Enter the base value: ");
                    double baseValue = scanner.nextDouble();
                    System.out.print("Enter the percentage: ");
                    double percentage = scanner.nextDouble();
                    double resultPercentage = (percentage / 100) * baseValue;
                    System.out.println(percentage + "% of " + baseValue + " = " + resultPercentage);
                    break;
                case 11:
                    System.out.println("Exiting the Scientific Calculator.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
