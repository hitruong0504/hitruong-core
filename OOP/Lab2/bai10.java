public class bai10 {
    static int third(int arr[])
    {
        int max1 = 0, max2 = 0, max3 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max1 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max1 == arr[i]) {
                continue;
            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (max1 == arr[i]) {
                continue;
            } else if (max2 == arr[i]) {
                continue;
            } else if (max3 < arr[i]) {
                max3 = arr[i];
            }
        }
        return max3;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9, 6 };
        System.out.println("Phan tu lon thu 3 trong mang " + third(arr));
    }
}
