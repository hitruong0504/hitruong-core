package Lab8;

import java.util.Scanner;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        Vector<Integer> X = new Vector<Integer>();
        Vector<Integer> Y = new Vector<Integer>();
        System.out.print("Enter length of vector: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            X.add(new Scanner(System.in).nextInt());
            Y.add(2 * X.get(i) * X.get(i) + 1);
        }
        System.out.println("--------------------------------");
        System.out.print("Vector Y: ");
        for (Integer i : Y) {
            System.out.print(i + " ");
        }
    }
}
