package Lab6;

public class CircleEx4 extends Shape{
    private double radius;

    //constructors
    public CircleEx4() {
        this.radius = 1.0;
    }

    public CircleEx4(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //methods

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * this.radius * 3.14;
    }

    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            ", radius='" + getRadius() + "'" +
            ", area='" + getArea() + "'" +
            ", perimeter='" + getPerimeter() + "'" +
            "}";
    }
}
