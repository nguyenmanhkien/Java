package Rectangle;

public class Test_Rectanglee {
    public static void main(String[] args){
        Rectanglee r1 = new Rectanglee(4,3);
        System.out.println("The Length is: " + r1.getLength());
        System.out.println("The Width is: " + r1.getWidth());
        System.out.printf("The Area is: %.2f%n", r1.getArea());

        Rectanglee r2 = new Rectanglee(6);
        System.out.println("The Length is: " + r2.getLength());
        System.out.println("The Width is: " + r2.getWidth());
        System.out.printf("The Area is: %.2f%n", r2.getArea());

        Rectanglee r3 = new Rectanglee();
        System.out.println("The Length is: " + r3.getLength());
        System.out.println("The Width is: " + r3.getWidth());
        System.out.printf("The Area is: %.2f%n", r3.getArea());
    }
}
