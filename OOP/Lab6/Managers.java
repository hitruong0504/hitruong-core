package Lab6;

public class Managers extends Employee {
    private String position;
    private double salaryCoefficientPosition;

    //constructors
    public Managers() {
        super();
        this.position = "head of the office at the administrative office ";
        this.salaryCoefficientPosition = 5.0;
    }
    
    public Managers(String ID, String fullName, double coefficientsSalary, String position,
            double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }


    public Managers(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff,
            String position, double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    //methods
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        return this.basicSalary * this.salaryCoefficientPosition;
    }

    public double getSalary() {
        return super.getSalary() + bonusByPosition();
    }
}
