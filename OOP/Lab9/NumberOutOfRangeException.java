package Lab9;

public class NumberOutOfRangeException extends ArithmeticException{ //ArithmeticException unchecked.
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}
