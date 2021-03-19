public class bai8 {
    static Integer findMax(Integer n, Integer arr[])
    {
        Integer a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 5, 8 };
        Integer n = arr.length;
        System.out.println("So lon nhat trong mang la: " + findMax(n, arr));
    }
}
