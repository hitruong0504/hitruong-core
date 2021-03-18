import java.util.Scanner;
import java.lang.*;
public class b4 {
    static int count(int n, int k, int arr[])
    {
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 9, 6, 8, 9, 4, 5, 9, 7 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat ki: ");
        int k = sc.nextInt();
        System.out.println(k + " co " + count(n, k, arr) + " phan tu");
    }
}