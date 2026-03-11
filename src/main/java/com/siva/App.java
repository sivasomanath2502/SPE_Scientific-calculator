package com.siva;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //Trigger Test
        CalculatorService calculator = new CalculatorService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Add");
            System.out.println("6. Subtract");
            System.out.println("7. Multiply");
            System.out.println("8. Divide");
            System.out.println("9. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter number: ");
                        double num = scanner.nextDouble();
                        System.out.println("Result: " + calculator.squareRoot(num));
                        break;

                    case 2:
                        System.out.print("Enter number: ");
                        int fact = scanner.nextInt();
                        System.out.println("Result: " + calculator.factorial(fact));
                        break;

                    case 3:
                        System.out.print("Enter number: ");
                        double ln = scanner.nextDouble();
                        System.out.println("Result: " + calculator.naturalLog(ln));
                        break;

                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exp = scanner.nextDouble();
                        System.out.println("Result: " + calculator.power(base, exp));
                        break;

                    case 5:
                        System.out.print("Enter first number: ");
                        double a = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double b = scanner.nextDouble();
                        System.out.println("Result: " + calculator.add(a, b));
                        break;

                    case 6:
                        System.out.print("Enter first number: ");
                        double s1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double s2 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.subtract(s1, s2));
                        break;

                    case 7:
                        System.out.print("Enter first number: ");
                        double m1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double m2 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.multiply(m1, m2));
                        break;

                    case 8:
                        System.out.print("Enter first number: ");
                        double d1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double d2 = scanner.nextDouble();
                        System.out.println("Result: " + calculator.divide(d1, d2));
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}