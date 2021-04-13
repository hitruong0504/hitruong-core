package Lab6;

public class Square extends Rectangle {
    private double side;

    //constructors
    public Square() {
        this.side = 1.0;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    
    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        setWidth(width);
    }

    public void setLength(double length) {
        setLength(length);
    }

    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            ", width='" + getWidth() + "'" +
            ", length='" + getLength() + "'" +
            ", area='" + getArea() + "'" +
            ", perimeter='" + getPerimeter() + "'" +
            "}";
    }
}