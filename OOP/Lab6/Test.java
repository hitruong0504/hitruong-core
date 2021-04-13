package Lab6;

public class Test {
   public static void main(String[] args) {
    Circle c1 = new Circle("blue", 1.3);
    Cylinder c2 = new Cylinder("white", 1.6, 10);

    Person p1 = new Person("Truong Anh Hi", "123v");
    Student s1 = new Student("Truong Anh Hi", "123v", "CLC", 2020, 12);
    Staff s2 = new Staff("Truong Anh Hi", "123v", "TDT", 12);

    Point2D po1 = new Point2D(9, 6);
    Point3D po2 = new Point3D(3.3f, 5, 6);

    Managers m1 = new Managers();

    System.out.println(m1.getSalary());
   //  System.out.println(po2);
   //  System.out.println(s1);
   //  System.out.println(s2);
   }
}
