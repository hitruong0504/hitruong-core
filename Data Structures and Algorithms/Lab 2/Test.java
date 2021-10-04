import java.util.Locale;
import java.util.NoSuchElementException;

public class Test {

    //exercise 3
    public static int power(int x, int y){
        int result = 1;
        for(int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
//    function test recur
//    public static int compute(int n){
//        if(n == 1) return 3;
//        return power(2, n) + power(n, 2) + compute(n - 1);
//    }

    public static int computeWithStack(int n){
        MyStack<Integer> stack = new MyStack<>();

        while(n > 1){
            stack.push(power(2, n) + power(n, 2));
            n--;
        }

        int total= 0;
        while (!stack.isEmpty()){
            total += stack.pop();
        }
        return 3 + total;
    }

    //exercise 4
    public static String printReverse(String input){
        String rString = "";
        MyStack<Character> stack = new MyStack<>();
        //add an char into stack.
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.isEmpty()){
            rString += stack.pop();
        }
        return rString;
    }

    //exercise 5
    public static boolean areBalancebrackets(String expression){
        MyStack<Character> stack = new MyStack<>();

        for (char ch : expression.toCharArray()) {
            if ((ch != '(') && (ch != '{') && (ch != '[') && (ch != ')') && (ch != '}') && (ch != ']')) {
                continue;
            }
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }

            if (!stack.isEmpty() && (stack.getPeek() == '(' && ch == ')') || (stack.getPeek() == '{' && ch == '}')
                    || (stack.getPeek() == '[' && ch == ']')) {
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return false;
        }else{
        return true;
        }
    }

    //exercise 7
    public static boolean palindrome(String string){
        String str = string.toLowerCase();
        MyStack<Character> stack = new MyStack<>();
        MyQueue<Character> queue = new MyQueue<>();
        for(Character ch: str.toCharArray()){
            if(Character.isLetter(ch)){
                stack.push(ch);
                queue.enQueue(ch);
            }
        }

        boolean ans = true;
        try {
            while (!stack.isEmpty() && ans) {
                if (!(stack.pop().equals(queue.deQueue()))) {
                    ans = false;
                }
            }
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException();
        }
        return ans;
    }

    public static void main(String[] args) {
//        MyStack<Fraction> stack = new MyStack<Fraction>();
//
//        stack.push(new Fraction(1, 4));
//        stack.push(new Fraction(9, 4));
//        stack.push(new Fraction(3, 4));
//        stack.push(new Fraction(6, 5));
//
//        stack.print();
//        System.out.println(stack.getPeek());
//        stack.print();

//        MyQueue<Fraction> queue = new MyQueue<>();
//
//        queue.enQueue(new Fraction(5, 6));
//        queue.enQueue(new Fraction());
//        queue.enQueue(new Fraction(1, 2));
//        queue.enQueue(new Fraction(9, 5));
//        queue.enQueue(new Fraction(5, 8));
//
//        queue.print();
//        queue.deQueue();
//        System.out.println(queue.getFront());
//        queue.print();

//        exercise3
//        System.out.println(computeWithStack(4));
        // exercise 4
//        System.out.println(printReverse("012345678"));
        // exercise 5
//        if (areBalancebrackets("{a - (b + f[4]) * 3 * d + f[5]}")){
//            System.out.println("Balance");
//        }else{
//            System.out.println("Not balance");
//        }
        //exercise 6
        QueueWithTwoStack<Integer> myQueue = new QueueWithTwoStack<>();

        myQueue.enQueue(new Integer(2));
        myQueue.enQueue(new Integer(3));
        myQueue.enQueue(new Integer(4));
        myQueue.enQueue(new Integer(5));

//        System.out.println(myQueue.deQueue());
        myQueue.print();
        //exercise 7
        if (palindrome("A man, a plan, a canal: Panama")){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}
