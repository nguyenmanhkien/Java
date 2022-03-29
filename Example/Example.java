package Example;

public class Example {
    String Name;
    Double GPA;
    public Example(){
        Name = "Kien dep trai vip pro";
        GPA = 10.0;
    }
    public Example(double g){
        Name = "Kien dep trai vip pro";
        GPA = g;
    }
    public  Example(double g, String n){
        Name = n;
        GPA = g;
    }
    public String getName(){
        return Name;
    }
    public  double getGPA(){
        return GPA;
    }
}
