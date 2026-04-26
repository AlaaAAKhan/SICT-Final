import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10.0, calc.calculate(7, 3, "Add"));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.calculate(10, 0, "Divide");
        });
    }

    @Test
    void testMultiply(){
        assertEquals(15.0, calc.calculate(5, 3, "Multiply"));
    }
}