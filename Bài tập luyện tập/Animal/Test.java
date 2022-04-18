package Animal;

public class Test {
    public static void main(String[] args) {
        animal a1 = new animal("Khanh");
        System.out.println(a1);

        Dog d1 = new Dog("Khanh");
        System.out.println(d1);
        Dog.greets();

        Cat c1 = new Cat("Linh");
        System.out.println(c1);
        Cat.greets();
    }

}
