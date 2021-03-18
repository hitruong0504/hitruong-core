public class bai2 {
    static int findMin(int n, int arr[])
    {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a > arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 8 };
        int n = arr.length;
        System.out.println("So be nhat trong mang la: " + findMin(n, arr));
    }
}
