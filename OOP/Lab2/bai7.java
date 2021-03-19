public class bai7 {
    static void square(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.pow(arr[i], 2);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        square(arr);
        System.out.print("\nMang sau khi binh phuong cac phan tu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
