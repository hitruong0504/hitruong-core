package Lab6;

public class Employee {
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff;

    protected int basicSalary = 1150;

    //constructors
    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2020;
        this.numDaysOff = 0;
    }


    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }

    //methods
    public double getSenioritySalary() {
        if (2021 - yearJoined >= 5) {
            return (2021 - yearJoined) * this.basicSalary / 100;
        }
        return 0;
    }

    public String considerEmulation() {
        if (numDaysOff <= 1)
            return "A";
        if (numDaysOff <= 3)
            return "C";
        return "B";
    }
    
    public double getSalary() {
        double emulationCoefficient = 1.0;
        String temp = this.considerEmulation();
        if (temp.equals("B"))
            emulationCoefficient = 0.75;
        if (temp.equals("C"))
            emulationCoefficient = 0.5;

        return this.basicSalary * this.coefficientsSalary * emulationCoefficient + getSenioritySalary();
    }
    
}
