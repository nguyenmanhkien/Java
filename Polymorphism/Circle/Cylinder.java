package Polymorphism.Circle;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public double getArea(){
        return 2.0*Math.PI*getRadius()*height;
    }
    @Override
    public String toString(){
        return "Cylinder [ height = "+height + "," +super.toString()+"]";
    }
}
