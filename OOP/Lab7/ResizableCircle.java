package Lab7;

public class ResizableCircle extends Circle implements IResizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        double r = super.getRadius();
        r = r * percent / 100.0;
        setRadius(r);
    }
    
}
