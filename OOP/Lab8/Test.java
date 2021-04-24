package Lab8;

import java.util.ArrayList;

import Lab4.main;

public class Test {
    public static ArrayList<StudentEx3> findStudent(ArrayList<StudentEx3> lstStu) {
        ArrayList<StudentEx3> list = new ArrayList<StudentEx3>();

        for (StudentEx3 item : lstStu) {
            if (item.getRank().equals("A") || item.getRank().equals("Passed")) {
                list.add(item);
            }
        }
        return list;
    }

    public static void display(ArrayList<StudentEx3> list) {
        for (StudentEx3 item : list) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        ArrayList<StudentEx3> students = new ArrayList<StudentEx3>();

        students.add(new ITStudent(123, "abc", 7.0));
        students.add(new ITStudent(123, "abc", 8.1));
        students.add(new MathStudent("520h0356", "Truong Anh Hi", 7.5));
        students.add(new MathStudent("52000356", "Hitruong", 4.0));

        display(students);
        System.out.println("--------------------------------");
        ArrayList<StudentEx3> newStudentList = findStudent(students);
        display(newStudentList);

    }
}
