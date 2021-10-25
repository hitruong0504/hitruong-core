import sun.misc.Queue;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StackAndQueue {

    public StackAndQueue(){}

    //2 STACK AND QUEUE
        //exercise 1
    public double calculate(String string){
        Stack<Double> stack = new Stack<>();
        for(Character ch : string.toCharArray()){
            if(Character.isDigit(ch)) stack.push((double)Character.getNumericValue(ch));
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                double a = stack.pop();
                double b = stack.pop();
                if(ch == '+') stack.push(b + a);
                if(ch == '-') stack.push(b - a);
                if(ch == '*') stack.push(b * a);
                if(ch == '/') stack.push(b / a);
            }
        }
        return stack.pop();
    }

        //exercise 2
    public boolean isPalindrome(int num){
        if(num < 0) throw new IllegalArgumentException("can not check negative number!!!");

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new Queue<>();

        while(num > 0){
            int temp = num % 10;
            stack.push(temp);
            queue.enqueue(temp);
            num /= 10;
        }
        boolean ans = true;
        try{
            while(!stack.empty() && ans){
                if(!(stack.pop().equals(queue.dequeue()))) ans = false;
            }
        }catch(NoSuchElementException | InterruptedException e){
            e.printStackTrace();
        }
        return ans;
    }
        //exercise 3
    public String reverseString(String string){
        String result = "";
        String []array = string.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        while(!stack.empty()){
            result += stack.pop() + " ";
        }
        return result;
    }
}
