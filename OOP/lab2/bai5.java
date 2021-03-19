public class bai5 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int prime(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i]) == true)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Co " + prime(arr) + " phan tu trong mang la so nguyen to");
    }
}