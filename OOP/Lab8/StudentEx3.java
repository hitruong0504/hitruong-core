package Lab8;

public abstract class StudentEx3 {
    private String sName;
    private double gpa;


    public StudentEx3(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }


    public String getSName() {
        return this.sName;
    }

    public void setSName(String sName) {
        this.sName = sName;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public abstract String getRank();

    @Override
    public String toString() {
        return 
            " sName='" + getSName() + "'" +
            ", gpa='" + getGpa() + "'";
    }


}
