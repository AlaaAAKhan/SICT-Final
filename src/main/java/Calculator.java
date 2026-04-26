import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public double calculate(double num1, double num2, String operation) {
        logger.info("Calculated: {} {} {}", num1, operation, num2);

        try {
            switch (operation) {
                case "Add":      return num1 + num2;
                case "Subtract": return num1 - num2;
                case "Multiply": return num1 * num2;
                case "Divide":
                    if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                    return num1 / num2;
                default: return 0;
        }
        } catch (ArithmeticException e) {
            logger.error("Mathematical error: {}", e.getMessage());
            throw e;
        }
    }
}
