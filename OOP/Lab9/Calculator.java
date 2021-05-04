package Lab9;

public class Calculator {
    
    public double divide(int a, int b) {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        if (b == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return 1.0 * a / b;
    }

    public int multiply(int a, int b) {
        if (a < -1000 || a > 1000 || b < -1000 || b > 1000) {
            throw new NumberOutOfRangeException("Number is outside the computation");
        }
        return a * b;
    }
}
