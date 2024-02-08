import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Calculator!");
        System.out.println("Enter the operation you want to perform:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exponentiation (^)");

        int choice = scanner.nextInt();
        double result;

        switch (choice) {
            case 1:
                result = addition();
                break;
            case 2:
                result = subtraction();
                break;
            case 3:
                result = multiplication();
                break;
            case 4:
                result = division();
                break;
            case 5:
                result = exponentiation();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    public static double subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    public static double multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    public static double division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static double exponentiation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        double base = scanner.nextDouble();
        System.out.println("Enter exponent:");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
