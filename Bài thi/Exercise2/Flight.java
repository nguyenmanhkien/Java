package Exercise2;

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        destination = "Empty";
        number = 0;
    }
    public Flight(int number,String destination){
        this.number = number;
        this.destination = destination;
    }
    public void display(){
        System.out.println(number + "," + destination);
    }
    public String getDestination(){
        return destination;
    }
    public int getNumber(){
        return number;
    }
}
