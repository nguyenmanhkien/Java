package Exercise2;

public class testFlight {
    public static void main(String[] args) {
        Flight f1 = new Flight(857,"Toronto");
        System.out.println("Number: " + f1.getNumber());
        System.out.println("Destination: "+ f1.getDestination());
        f1.display();

        Flight f2 = new Flight();
        System.out.println("Number: " + f2.getNumber());
        System.out.println("Destination: "+ f2.getDestination());
        f2.display();
    }
}
