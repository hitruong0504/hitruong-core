package Lab8;

public class Employee extends Person{
    private double salary;

    public Employee(String name, int yearOfBirth, String id, double salary) {
        super(name, yearOfBirth, id);
        this.salary = salary;
    }


    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
        super.toString() +
                " salary='" + getSalary() + "'" +
            "}";
    }


}
