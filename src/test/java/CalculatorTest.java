import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAdditionWithNegativeNumbers() {
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testSubtractionWithNegativeResult() {
        assertEquals(-4, calculator.subtract(1, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testMultiplicationWithNegativeNumbers() {
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test
    public void testDivisionWithNegativeNumbers() {
        assertEquals(-2, calculator.divide(10, -5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    public void testSquare() {
        assertEquals(25, calculator.square(5));
    }

    @Test
    public void testSquareOfOne() {
        assertEquals(1, calculator.square(1));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, calculator.squareRoot(16.0), 0.001);
    }

    @Test
    public void testSquareRootOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1.0));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, calculator.factorial(1));
    }

    @Test
    public void testPower() {
        assertEquals(32, calculator.power(2, 5));
    }

    @Test
    public void testPowerWithZeroExponent() {
        assertEquals(1, calculator.power(5, 0));
    }

//    @Test
//    public void testPowerWithNegativeExponent() {
//        assertThrows(IllegalArgumentException.class, () -> calculator.power(2, -1));
//    }
}
