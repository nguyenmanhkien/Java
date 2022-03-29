package Example;

public class TestExample {
    public static void main(String[] args){
        Example Case1 = new Example(10.0, "Kien dep trai vip pro");
        System.out.println("Name is: " + Case1.Name);
        System.out.println("GPA is: " + Case1.GPA);

        Example Case2 = new Example(10.0);
        System.out.println("Name is: " + Case2.Name);
        System.out.println("GPA is: " + Case2.GPA);

        Example Case3 = new Example();
        System.out.println("Name is: " + Case3.Name);
        System.out.println("GPA is: " + Case3.GPA);
    }
}
