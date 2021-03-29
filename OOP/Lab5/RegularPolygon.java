package Lab5;

public class RegularPolygon {
    private String name;
    private int edgeAmount;
    private double edgeLength;

    //contructor
    public RegularPolygon() {
        this.name = "";
        this.edgeAmount = 3;
        this.edgeLength = 1;
    }

    public RegularPolygon(String name, int edgeAmount, double edgeLength) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = edgeLength;
    }

    public RegularPolygon(String name, int edgeAmount) {
        this.name = name;
        this.edgeAmount = edgeAmount;
        this.edgeLength = 1;
    }

    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.edgeAmount = polygon.edgeAmount;
        this.edgeLength = polygon.edgeLength;
    }

    //methods
    public String getName() {
        return this.name;
    }

    public int getEdgeAmount() {
        return this.edgeAmount;
    }

    public double getEdgeLength() {
        return this.edgeLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdgeAmount(int edgeAmount) {
        this.edgeAmount = edgeAmount;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;
    }

    public String getPolygon() {
        if (this.edgeAmount == 3)
            return "Triangle";
        else if (this.edgeAmount == 4)
            return "Quadrangle";
        else if (this.edgeAmount == 5)
            return "Pentagon";
        else if (this.edgeAmount == 6)
            return "Hexagon";
        else
            return "Polygon has the number of edges greater than 6";
    }
    
    public double getPerimeter() {
        return this.edgeLength * this.edgeAmount;
    }

    public double getArea() {
        if (this.edgeAmount > 6) {
            return -1;
        }
        double a = 0.433;
        if (this.edgeAmount == 4)
            a = 1;
        if (this.edgeAmount == 5)
            a = 1.72;
        if (this.edgeAmount == 6)
            a = 2.595;

        return this.edgeLength * this.edgeLength * a;
    }
    
    public String toString() {
        return this.name + " - " + this.getPolygon() + " - " + this.getArea();
    }
}
