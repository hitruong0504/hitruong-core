public class RecursionSolution {
    //exercise 2
    //a
    public static int factorial(int n){
        if(n == 0) return 1; // base case
        return n * factorial(n - 1);
    }
    //b
    public static int compute(int x, int n){
        if(n == 1) return x; // base case
        return x * compute(x, n -1);
    }
    //c
    public static int countDigits(int n){
        if(n < 10) return 1; // base case
        return countDigits(n/10) + 1;
    }
    //d
    public static int GCDUsingEuclid(int a, int b){
        if(a == 0) return b; //base case
        if(b == 0) return a; //base case

        if(a > b)
            return GCDUsingEuclid(a % b, b);
        else
            return GCDUsingEuclid(a, b % a);
    }
    //exercise 3
    public static boolean checkPrime(int n, int d){
        // base case
//        if(n <= 2)
//            return n == 2;
//        if(n % d == 0)
//            return false;
//        if(d * d > n)
//            return true;
        if (d == 1) return true;
        if(n % d == 0) return false;
        else return checkPrime(n, d - 1);
    }
    //exercise 4
    //a
    public static int sum4a(int n){
        if(n == 1) return 3;
        else return 2 * n + 1 + sum4a(n - 1) ;
    }
    //b
    public static int sum4b(int n){
        if(n == 1) return 1;
        else return factorial(n) + sum4b(n - 1);
    }
    //c
    public static long mul4c(int n){
        if(n == 1) return 1;
        else return factorial(n) * mul4c(n - 1);
    }
    //d
    public static int expression1(int n, int r){
        if(n >= r && r > 0) return factorial(n) / factorial(n - r);
        else return 1;
    }
    //e
    public static int power(int x, int y){
        int result = 1;
        for(int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static int expression2(int n){
        if(n == 1) return 3;
        return power(2, n) + power(n, 2) + expression2(n - 1);
    }
    //exercise 5
    public static int convertDtoB(int n){
        if(n == 0) return 0;
        else return n % 2 + 10 * convertDtoB(n/2);
    }

    public static void main(String[] args) {
        //a
        System.out.println(factorial(5));
        //b
        System.out.println(compute(2, 3));
        //c
        System.out.println(countDigits(3597));
        //d
        System.out.println(GCDUsingEuclid(30, 50));
        //exercise 3
        System.out.println(checkPrime(12, 12));
        //exercise 4
        //a
        System.out.println(sum4a(8));
        //b
        System.out.println(sum4b(6));
        //c
        System.out.println(mul4c(5));
        //d
        System.out.println(expression1(5, -1));
        //exercise 5
        System.out.println(convertDtoB(10));
    }
}