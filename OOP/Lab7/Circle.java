package Lab7;

public class Circle implements IGeometricObject{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    

    public double getPerimeter() {
        
        return 2 * 3.14 * this.radius;
    }

    
    public double getArea() {
        
        return 3.14 * this.radius * this.radius;
    }


}
