package Interface;

public abstract class Movable_Point implements Moveable {
    private int x,y;

    public Movable_Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    @Override
    public void moveUp(){
        y--;
    }
    @Override
    public void moveDown(){
        y++;
    }
    @Override
    public void moveLeft(){
        x--;
    }
    @Override
    public void moveRight(){
        x++;
    }
}
