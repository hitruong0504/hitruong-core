package Lab6;

public class Point3D extends Point2D{
    private float z;
    private float[] temp1 = new float[3];

    //constructor
    public Point3D() {
        super();
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    //methods

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x , float y , float z)
    {
        setZ(z);
        setX(x);
        setY(y);
    }

    public float[] getXYZ() {
        this.temp1[0] = getX();
        this.temp1[1] = getY();
        this.temp1[3] = getZ();

        return this.temp1;
    }

    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            ", z='" + getZ() + "'" +
            "}";
    }
}
