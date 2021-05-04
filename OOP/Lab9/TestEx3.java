package Lab9;

import java.io.FileWriter;
import java.util.ArrayList;

import Lab8.*;


public class TestEx3 extends Test{ // Test lab 8

    public static <E> boolean writeFileEx3(String path, ArrayList<E> list) {
        
        try {
            FileWriter writer = new FileWriter(path);
            for (E e : list) {
                writer.write(e.toString());
                writer.write(System.lineSeparator());
            }
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<StudentEx3> students = new ArrayList<StudentEx3>();
        
        students.add(new ITStudent(123, "abc", 7.0));
        students.add(new ITStudent(123, "abc", 8.1));
        students.add(new MathStudent("520h0356", "Truong Anh Hi", 7.5));
        students.add(new MathStudent("52000356", "Hitruong", 4.0));

        System.out.println("" + writeFileEx3("C:\\Practice\\Java\\OOP\\src\\Lab9\\output1.txt", findStudent(students)));
        
    }
}