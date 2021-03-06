package h520h0356;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        System.out.println("-----Menu-----");
        System.out.println("1. Coca");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Snack");
        System.out.println("5. Shutdown Machine");

        System.out.print("Please enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("The price of Coca is 2$.");
                System.out.print("Please enter the amount of money: ");
                double m = sc.nextDouble();
                if (n <= m) {
                    System.out.println("Your change is " + (m - 2) + "$");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;
            case 2:
                System.out.println("The price of Pepsi is 2.5$.");
                System.out.print("Please enter the amount of money: ");
                double m1 = sc.nextDouble();
                if (n <= m1) {
                    System.out.println("Your change is " + (m1 - 2.5) + "$");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;
            case 3:
                System.out.println("The price of Sprite is 1.75$.");
                System.out.print("Please enter the amount of money: ");
                double m2 = sc.nextDouble();
                if (n <= m2) {
                    System.out.println("Your change is " + (m2 - 1.75) + "$");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;
            case 4:
                System.out.println("The price of Snack is 1$.");
                System.out.print("Please enter the amount of money: ");
                double m3 = sc.nextDouble();
                if (n <= m3) {
                    System.out.println("Your change is " + (m3 - 1) + "$");
                } else {
                    System.out.println("Not enough money to buy this item. Please select again");
                }
                break;
            case 5:
                System.out.println("Machine is shutting down.");
                break;    
            default:
                System.out.println("Please enter the valid number.");
                break;
        }
    }
}
