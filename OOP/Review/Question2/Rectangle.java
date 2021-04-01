public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName(){
        //code here and correct the return value
        return this.name;
    }

    public String getColor(){
        //code here and correct the return value
        return this.color;
    }

    public double getWidth(){
        //code here and correct the return value
        return this.width;
    }
    public double getLength(){
        //code here and correct the return value
        return this.length;
    }

    public void setName(String name){
        //code here
        this.name = name;
    }

    public void setColor(String color){
        //code here
        this.color = color;
    }

    public void setWidth(double width){
        //code here
        this.width = width;
    }

    public void setLength(double length){
        //code here
        this.length = length;
    }

    public double getPerimeter(){
        //code here and correct the return value
        return (this.width + this.length) * 2;
    }

    public String getType(){
        //code here and correct the return value
        double area = this.length * this.width;
        if (area >= 10) {
            return "A";
        } else if(area >= 5 && area < 10){
            return "B";
        }else
            return "C";
    }
	
	public boolean isSquare(){
        //code here and correct the return value
        return (this.length == this.width);
    }

    public double calDiagonalLine(){
        //code here and correct the return value
        return Math.sqrt((this.length * this.length) + (this.width * this.width));
    }

    public Rectangle resize(double rate){
         //code here and correct the return value
        Rectangle r1 = new Rectangle(this.name, this.color, this.width, this.length);
        r1.width *= rate;
        r1.length *= rate;
        return r1;
    }

    public String toString(){
        //code here and correct the return value
        return "Rectangle[" + this.name + ", " + this.width + ", "+ this.length + ", " + this.getType() + "]";
    }
}