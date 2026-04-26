public class Calculator {
    public double calculate(double num1, double num2, String operation) {
        switch (operation) {
            case "Add":      return num1 + num2;
            case "Subtract": return num1 - num2;
            case "Multiply": return num1 * num2;
            case "Divide":
                if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                return num1 / num2;
            default:         return 0;
        }
    }
}
