public class bai3 {
    static int sumEven(int n, int arr[])
    {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                s += arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 9, 10 };
        int n = arr.length;
        System.out.println("Tong cac phan tu chan trong mang la: " + sumEven(n, arr));
    }
}
