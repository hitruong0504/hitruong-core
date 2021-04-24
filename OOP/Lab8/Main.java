package Lab8;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Point> filter(ArrayList<Point> list) {
        ArrayList<Point> newList = new ArrayList<Point>();

        for (Point item : list) {
            double distance = Math.sqrt(item.getX() * item.getX() + item.getY() * item.getY());
            if (distance <= 1) {
                newList.add(item);
            }
        }
        return newList;
    }

    public static void display(ArrayList<Point> list) {
        for (Point p : list) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ArrayList<Point> listPoint = new ArrayList<Point>();

        Random rand = new Random(); 

         
        listPoint.add(new Point(rand.nextInt(10), rand.nextInt(10))); // lay so ngau nhien tu 0 den 9
        listPoint.add(new Point(rand.nextInt(10), rand.nextInt(10))); // lay so ngau nhien tu 0 den 9
        listPoint.add(new Point(rand.nextInt(10), rand.nextInt(10))); // lay so ngau nhien tu 0 den 9
        listPoint.add(new Point(rand.nextInt(10), rand.nextInt(10))); // lay so ngau nhien tu 0 den 9
        listPoint.add(new Point(rand.nextInt(10), rand.nextInt(10))); // lay so ngau nhien tu 0 den 9
        listPoint.add(new Point(0, 1));
        
        display(listPoint);

        ArrayList<Point> point = filter(listPoint);
        System.out.println("--------------------------");
        display(point);
    }
}
