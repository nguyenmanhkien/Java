package Animal_2;

import Animal.Dog;

public class Bigdog extends Dog2 {
    public Bigdog(String name) {
        super(name);
    }
    public static void greets(){
        System.out.println("woof");
    }
    public static void greets(Dog another){
        System.out.println("Woooof");
    }
    public static void greets(Bigdog another){
        System.out.println("Wooooooooooooof");
    }
}
