package Animal;

public class Mammal extends animal {
    public Mammal(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal ["+ super.toString()+"]";
    }
}
