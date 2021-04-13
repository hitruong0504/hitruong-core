package Lab6;

public class Circle {
    private String color;
    private double radius;

    //construct

    public Circle() {
        this.color = "red";
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    //methods
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", radius='" + getRadius() + "'" +
            "}";
    }


}
