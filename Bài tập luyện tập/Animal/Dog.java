package Animal;

public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }
    public static void greets(){
        System.out.println("woof");
    }
    public static void greets(Dog another){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog ["+ super.toString() + "]";
    }
}
