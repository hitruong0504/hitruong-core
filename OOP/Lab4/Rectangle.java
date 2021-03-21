package Lab4;

public class Rectangle {
    private float width;
    private float length;

    // constructor
    public Rectangle() {
        width = 1.0f;
        length = 1.0f;
    }

    public Rectangle(float width, float length) {
        if (width > 0)
            this.width = width;
        if (length > 0)
            this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public void setLength(float length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public String toString() {
        return "Rectangle[width: " + this.width + "," + " length: " + this.length + "]";
    }
}

