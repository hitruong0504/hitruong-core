import java.util.Scanner;

public class bai1 {
    static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static void output(int[] a)
    {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    static void output1(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
    {
                continue;
            } else {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
    //1
    //. xoa phan tu chi dinh trong mang, tra ve true, neu phan tu khong ton tai tra ve false
    static boolean remove(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                int j = i + 1;
                if (i != a.length - 1) {
                    for (; j < a.length; j++) {
                        a[j - 1] = a[j];
                    }
                }
                a[j - 1] = 0;
                return true;
            }
        }
        return false;
    }
    //..chen phan tu vao vi tri cho truoc trong mang
    static void insert(int[] a, int n, int k)
    {
        for (int i = a.length - 1; i > n; i--) {
            a[i] = a[i - 1];
        }
        a[n] = k;
    }
    //...viet ham tra ve cac phan tu trung lap trong mang
    static int[] duplicate(int[] a) {
        int[] b = new int[a.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    b[k] = a[i];
                    k++;
                }
            }
        }
        return b;
    }
    //.... viet ham xoa bo phan tu trung lap trong mang
    static int[] removeDuplicate(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - count; i++) {
            for (int j = i + 1; j < a.length - count; j++) {
                if (a[i] == a[j]) {
                    count++;
                    for (int k = j; k < a.length - count; k++) {
                        a[k] = a[k + 1];
                    }
                }
            }
        }
        int[] temp = new int[a.length - count];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = a[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] a = input();
        // output(a);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1
        //.
        boolean result = remove(a, n);
        System.out.println(result);
        output(a);
        //..
        System.out.println("insert");
        int m = sc.nextInt();
        int k = sc.nextInt();
        insert(a, m, k);
        output(a);
        //...
        System.out.println("Duplicate");
        int[] c = input();
        int[] b = duplicate(c);
        output1(b);
        //....
        System.out.println("Remove Duplicate");
        int[] d = removeDuplicate(c);
        output1(d);
    }
}