import java.util.Scanner;

public class bai6 {
    static int count(int k, int arr[])
    {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i])
                c++;
        }
        if (c == 0) {
            return -1;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 3, 5, 7, 9, 11, 12, 14, 16 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(count(k, arr));
    }
}
