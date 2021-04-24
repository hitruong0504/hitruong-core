package Lab8;

public class ITStudent extends StudentEx3{
    private int sID;

    public ITStudent(int sID, String sName, double gpa) {
        super(sName, gpa);
        this.sID = sID;
    }


    public int getSID() {
        return this.sID;
    }

    public void setSID(int sID) {
        this.sID = sID;
    }


    public String getRank() {
        if (super.getGpa() > 8)
            return "A";
        if (super.getGpa() > 5)
            return "B";
        return "C";
    }

    public String toString() {
        return "ITStudent{" +
            super.toString() +
                " sID='" + getSID() + "'" +
                " rank='" + getRank() + "'" +
            "}";
    }
    
}
