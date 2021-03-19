import java.util.Scanner;

public class b9 {
    static int[] divisibleNumbers(int arr[], int k)
    {
        int[] b = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0)
            {
                b[j] = arr[i];
                j++;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr1 = divisibleNumbers(arr, k);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                continue;
            } else {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
