public class Recursion {

    public Recursion(){

    }

    //exercise 1
    //a
    public double pro_recur(int a, int b){
        if(a < b) return pro_recur(b, a);
        else if(b != 0) return (a + pro_recur(a, b - 1));
        else return 0;
    }
    //b
    public int bin2dec(int n, int exp){
        if(n == 0) return 0;
        else{
            int tmp = n % 10;
            int temp = n / 10;
            return (int) (tmp * Math.pow(2, exp) + bin2dec(temp, exp + 1));
        }
    }
    //c
    public int maxDigit(int n){
        if(n < 10) return n;

        int a = n % 10;
        int b = maxDigit(n / 10);

        if(a > b) return a;
        else return b;
    }
    //d
    public int maxElement(int a[], int n){
        if(a.length < 0) return 0;
        if(n == 0) return a[0];

        int x = a[n - 1];
        int y = maxElement(a, n - 1);

        if(x > y) return x;
        return y;
    }
    //e
    public int search(int a[], int n, int key){
        if(a.length < 0) return 0;
        if(n == 0) return a[0];
        if(a[n - 1] == key) return n;
        if(a[n - 1] != key) return -1;
        return search(a, n - 1, key);
    }

    //exercise 2
    //a
    public int sumA(int i){
        if(i == 1) return 2;
        return (int) (Math.pow(2, i) + sumA(i - 1));
    }
    //b
    public double sumB(int x){
        if(x == 0) return 0.5;
        return ((x + 1) / 2.0) + sumB(x - 1);
    }
    //e
    public int factorial(int i){
        if(i == 1) return 1;
        return i * factorial(i - 1);
    }
    //c
    public double sumC(int i){
        if(i == 1) return 1;
        return (factorial(i) * 1.0 / factorial(i - 1)) + sumC(i - 1);
    }
    //d
    public double sumD(int x){
        if(x == 1) return 0;
        return (x * (x - 1)) + sumD(x - 1);
    }

    //exercise 3
    //a
        //iteration
    public double itera_a(int n){
        double result = 2.0;
        for (int i = 1; i <= n; i++) {
            result = 2.0 - 0.5 * result;
        }
        return result;
    }
        //recursion
    public double recur_a(int n){
        if(n == 0) return 2;
        return 2.0 - 0.5 * recur_a(n - 1);
    }
    //b
        //iteration
    public double itera_b(int n){
        double result = 0.0;
        while(n > 0){
            result += 1;
            n /= 10;
        }
        return result;
    }
        //recursion
    public double recur_b(int n){
        if(n < 10) return 1;
        return 1 + recur_b(n / 10);
    }
    //c
        //iteration
    public int itera_c(int n, int k){
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += n;
        }
        return result;
    }
        //recursion
    public int recur_c(int n, int k){
        if(k == 1) return n;
        return n + recur_c(n , k - 1);
    }
    //d
        //iteration
    public int itera_d(int n){
        int result = 0;
        int num1 = 0, num2 = 1;
        for (int i = 0; i < n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
        //recursion
    public int recur_d(int n){
        if(n == 0 || n == 1) return 1;
        return recur_d(n - 1) + recur_d(n - 2);
    }
}
