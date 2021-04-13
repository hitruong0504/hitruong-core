package Lab6;

public class Shape {
    private String color;
    private boolean filled;

    //constructor
    public Shape() {
        this.color = "red";
        this.filled = true;
    }


    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //methods
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "{" +
            " color='" + getColor() + "'" +
            ", filled='" + isFilled() + "'" +
            "}";
    }

}
