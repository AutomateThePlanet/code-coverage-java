

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not allowed");
        }
        return Math.sqrt(a);
    }

    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of a negative number is not allowed");
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponent is not allowed");
        }
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
