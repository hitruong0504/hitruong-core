//exercise 1
public class IterationSolution {
    //a
    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    //b
    public static int compute(int x, int n){
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
    //c
    public static int countDigits(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    //d
    public static boolean isPrime(int n){
        if(n < 1) return false;
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if(n % i == 0) return false;
        }
        return true;
        // 16
        // 1 2 4 8 16
    }
    //e
    public static int GCDUsingEuclid(int a, int b){
        while(a != b){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        //a
        System.out.println(factorial(5));
        //b
        System.out.println(compute(2,3));
        //c
        System.out.println(countDigits(357));
        //d
        System.out.println(isPrime(2));
        //e
        System.out.println(GCDUsingEuclid(30, 50));
    }
}
