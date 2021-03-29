package Lab5;

import java.util.Scanner;

public class ArrayAs {
    //a: tim so chan lon nhat
    public static int maxEven(int[] a) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
    //b: tim so le nho nhat
    public static int minOdd(int[] a) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    //c: tong so chan lon nhat va so le nho nhat
    public static int sumMEMO(int[] a) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && max < a[i]) {
                max = a[i];
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0 && min > a[i]) {
                min = a[i];
            }
        }

        return max + min;
    }
    //d: tinh tong cac so chan trong mang
    public static int sumEven(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
            }
        }
        return sum;
    }
    //e: tinh tich cac phan tu le trong mang
    public static int prodOdd(int[] a) {

        int pro = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                pro *= a[i];
            }
        }
        return pro;
    }
    //f: tra ve vi tri dau tien cua phan tu chan trong mang.
    public static int idxFirstEven(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                return i + 1;
            }
        }
        return -1;
    }
    //g: tra ve vi tri cuoi cung cua phan tu le trong mang.
    public static int idxLastOdd(int[] a) {

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] % 2 != 0) {
                return i + 1;
            }
        }
        return -1;
    }
    //h: tra ve 1 mang so nguyen n phan tu nhap tu ban phim.
    public static int[] input(int n) {

        int[] a = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element @" + i + ": ");
            a[i] = scanner.nextInt();
        }
        return a;
    }
    //i: viet ham main va goi cac ham tren
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size array: ");
        int n = sc.nextInt();
        int[] arr = input(n);

        System.out.println("Max Even: " + maxEven(arr));
        System.out.println("Min Odd: " + minOdd(arr));
        System.out.println("Sum MaxEven and Min Odd: " + sumMEMO(arr));
        System.out.println("Sum Even: " + sumEven(arr));
        System.out.println("Product Odd: " + prodOdd(arr));
        System.out.println("Position FirstEven: " + idxFirstEven(arr));
        System.out.println("Position LastOdd: " + idxLastOdd(arr));
    }
}
