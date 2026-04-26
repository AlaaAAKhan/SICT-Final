import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to Calculator!");
        System.out.println("Please enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        double n2 = scanner.nextDouble();

        System.out.println("Please enter the number of the action you would like to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        String operation = "";
        switch(choice) {
            case 1:
                operation = "Add";
                break;
            case 2:
                operation = "Subtract";
                break;
            case 3:
                operation = "Multiply";
                break;
            case 4:
                operation = "Divide";
                break;
            default:
                System.out.println("Please enter a valid choice");
        }

        try {
            double result = calculator.calculate(n1, n2, operation);
            System.out.println("The result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
