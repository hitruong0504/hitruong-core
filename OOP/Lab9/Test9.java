package Lab9;

public class Test9 {
    public static void main(String[] args) {
        
        Calculator newCalculator = new Calculator();

        System.out.println(newCalculator.divide(6, 0));
        System.out.println(newCalculator.divide(6, 9));
        System.out.println(newCalculator.multiply(6, 5));
        System.out.println(newCalculator.multiply(3000, 5));
    }
}
