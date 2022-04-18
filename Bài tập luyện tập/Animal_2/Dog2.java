package Animal_2;

import Animal.Dog;

public class Dog2 extends  Animal2{
    public Dog2(String name) {
        super(name);
    }
    public static void greets(){
        System.out.println("woof");
    }
    public static void greets(Dog another){
        System.out.println("Woooof");
    }
}
