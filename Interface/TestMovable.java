package Interface;

public class TestMovable {
    public static void main(String[] args) {
        Movable_Point p1 = new Movable_Point(1, 2);
        System.out.println(p1);
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        Moveable p2 = new Movable_Point(3,4);
        p2.moveUp();
        System.out.println(p2);

        Movable_Point p3 = (Movable_Point)p2;
        System.out.println(p3);
    }
}
