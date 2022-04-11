package SS6;

public class CS8 {
    String name;
    public void run(){
        int count = 0;
        while (count<3){
            name = Thread.currentThread().getName();
            System.out.println(name);
            count++;
        }
    }
}
public class MainTest{
    public static void main(String[] args) {
        NamedThread objThead = new NamedThread();
        Thread objThread = new Thread(objNewThread);
        objThread.start();
    }
}
