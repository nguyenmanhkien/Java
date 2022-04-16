package Abstract;

abstract public class Shape {
    private String color;

    public Shape(String color){
        this.color=color;
    }

    public String toString(){
        return "Shape[ Color = " + color + "]";
    }
    abstract public double getArea();
}
