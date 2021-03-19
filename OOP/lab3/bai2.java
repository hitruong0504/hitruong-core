import java.util.Scanner;


public class bai2 {
    static int[][] input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao dong cua ma tran: ");
        int rows = sc.nextInt();
        System.out.print("Nhap vao so cot cua ma tran: ");
        int columns = sc.nextInt();
        int[][] a = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]= ");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    static void output(int[][] a) {
        System.out.println("Ma tran: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    //2
    //. cong 2 ma tran cung size
    static int[][] sum(int[][] a, int[][] b) {
        int[][] sum = b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    //.. nhan ma tran voi 1 so
    static void mul(int[][] a, int n) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = n * a[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] a = input();
        // output(a);
        int[][] b = input();
        int[][] c = sum(a, b);
        output(c);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can nhan voi ma tran: ");
        int n = scanner.nextInt();
        mul(c, n);
        output(c);
    }
}