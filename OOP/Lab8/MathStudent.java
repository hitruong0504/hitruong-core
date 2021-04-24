package Lab8;

public class MathStudent extends StudentEx3{
    private String sID;


    public MathStudent(String sID, String sName, double gpa) {
        super(sName, gpa);
        this.sID = sID;
    }


    public String getSID() {
        return this.sID;
    }

    public void setSID(String sID) {
        this.sID = sID;
    }

    public String getRank() {
        if (super.getGpa() >= 5)
            return "Passed";
        return "Failed";
    }


    public String toString() {
        return "MathStudent{" + super.toString() + " sID='" + getSID() + "'" + " rank='" + getRank() + "'" + "}";
    }
    
}
