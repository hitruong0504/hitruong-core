package Lab8;

public class Point {
    private int x, y;


    public Point() {
        this.x = 1;
        this.y = 1;
    }


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }


}
