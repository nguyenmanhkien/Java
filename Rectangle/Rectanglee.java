package Rectangle;

public class Rectanglee {
    private float length;
    private float width;

    public Rectanglee(){
        length = 1.0f;
        width = 1.0f;
    }
    public Rectanglee(float l, float w){
        length = l;
        width = w;
    }
    public Rectanglee(float l){
        length = l;
        width = 1.0f;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}
