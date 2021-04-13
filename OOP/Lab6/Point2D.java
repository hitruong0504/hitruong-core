package Lab6;

public class Point2D {
    private float x, y;
    private float[] temp = new float[2];

    //constructor
    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }


    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }


    //methods

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(float x, float y) {
        this.temp[0] = x;
        this.temp[1] = y;
        return this.temp;
    }

    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }

    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }

}
