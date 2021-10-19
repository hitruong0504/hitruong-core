public class Student {

    //attributes
    private String name;
    private double mathematics;
    private double programming;
    private double DSA1;

    //constructors
    public Student(){

    }

    public Student(String name, double mathematics, double programming, double DSA1){
        this.name = name;
        this.mathematics = mathematics;
        this.programming = programming;
        this.DSA1 = DSA1;
    }

    //getter and setter methods

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setMathematics(double mathematics){
        this.mathematics = mathematics;
    }

    public double getMathematics(){
        return this.mathematics;
    }

    public void setProgramming(double programming){
        this.programming = programming;
    }

    public double getProgramming(){
        return this.programming;
    }

    public void setDSA1(double DSA1){
        this.DSA1 = DSA1;
    }

    public double getDSA1(){
        return this.DSA1;
    }

    //calculate average
    public double getAvg(){
        double avg = (mathematics + programming + DSA1) / 3.0;
        return (int) (avg * 100) / 100.0;
    }

    //toString method
    public String toString(){
        return this.name + ", " + getAvg();
        //return this.name + ", " + this.mathematics + ", " + this.programming + ", " + this.DSA1 + ", " + getAvg();
    }
}
