package Lab8;

public class Student extends Person{
    private double score;

    public Student(String name, int yearOfBirth, String id, double score) {
        super(name, yearOfBirth, id);
        this.score = score;
    }


    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{" +
            super.toString() +
                " score='" + getScore() + "'" +
            "}";
    }

}
