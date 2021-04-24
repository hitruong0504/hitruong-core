package Lab8;

import java.util.ArrayList;

public class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();

    public void add(T obj) {
        al.add(obj);
    }

    public void display() {
        for (T obj : al) {
            System.out.println(obj);
        }
    }
    
    public static void main(String[] args) {
        PersonModel<Person> model = new PersonModel<Person>();

        model.add(new Student("Truong Anh Hi", 2002, "520h0356", 7.0));
        model.add(new Student("Hi Truong", 2002, "520H0356", 7.0));
        
        model.add(new Employee("Truong Anh Hi", 2002, "520h0356", 1000));
        model.add(new Employee("Hi Truong", 2002, "520h0356", 900));
        
        model.display();
    }
}