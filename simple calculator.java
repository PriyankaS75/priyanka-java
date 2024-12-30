import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            System.out.println("Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quotient");
            System.out.println("6. Remainder");
            System.out.println("7. Exponential");

            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0)
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    else
                        System.out.println("Error! Division by zero.");
                    break;
                case 5:
                    if (num2 != 0)
                        System.out.println(num1 + " // " + num2 + " = " + ((int) num1 / (int) num2));
                    else
                        System.out.println("Error! Division by zero.");
                    break;
                case 6:
                    if (num2 != 0)
                        System.out.println(num1 + " % " + num2 + " = " + ((int) num1 % (int) num2));
                    else
                        System.out.println("Error! Division by zero.");
                    break;
                case 7:
                    System.out.println(num1 + " ^ " + num2 + " = " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String input = scanner.next();
            repeat = input.equalsIgnoreCase("yes");
        }
    }
}