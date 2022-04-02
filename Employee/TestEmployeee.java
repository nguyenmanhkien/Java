package Employee;

public class TestEmployeee {
    public static void main(String[] args){
        Employeee E1 = new Employeee();
        System.out.println("Id: " + E1.getId());
        System.out.println("Full Name: " + E1.getFirstName() + E1.getLastName());
        System.out.println("Salary = " + E1.getSalary());

        Employeee E2 = new Employeee(2);
        System.out.println("Id: " + E2.getId());
        System.out.println("Full Name: " + E2.getFirstName() + E2.getLastName());
        System.out.println("Salary = " + E2.getSalary());
    }
}
