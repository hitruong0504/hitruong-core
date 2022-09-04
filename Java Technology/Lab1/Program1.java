public class Program1 {
    public static void main(String[] args) {
        // check expression
        if (args.length != 3) {
            System.out.println("Invalid expression");
            return;
        }
        
        // declare operator
        String operator = args[1];

        // check operator
        if (!operator.equals("+") && (!operator.equals("-")) && (!operator.equals("x")) && (!operator.equals("/"))
                && (!operator.equals("^"))) {
            System.out.println("Unsupported operator");
            return;
        }


        // check operands
        double o1, o2; // o stand for operand
        try {
            o1 = Double.parseDouble(args[0]);
            o2 = Double.parseDouble(args[2]);
        } catch (Exception e) {
            System.out.println("Operand(s) is(are) not a valid number!!!");
            return;
        }

        switch (operator) {

            case "+":
                System.out.println(o1 + o2);
                break;
            case "-":
                System.out.println(o1 - o2);
                break;
            case "x":
                System.out.println(o1 * o2);
                break;
            case "/":
                System.out.println(o1 / o2);
                break;
            case "^":
                System.out.println(Math.pow(o1, o2));
                break;
        }

    }
}