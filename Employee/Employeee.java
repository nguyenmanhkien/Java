package Employee;

public class Employeee {
    private int Id;
    private String FirstName;
    private String LastName;
    private int Salary;

    public Employeee(){
        Id = 1;
        FirstName = "Nguyen Manh";
        LastName = " Kien";
        Salary = 20000;
    }

    public Employeee( int I, String F, String L, int S){
        Id = I;
        FirstName = F;
        LastName = L;
        Salary = S;
    }
    public Employeee(int I) {
        Id = I;
        FirstName = "Dinh Quang";
        LastName = " Anh";
        Salary = 100;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return Id;
    }

    public int getSalary() {
        return Salary;
    }

    public int getAnnualSalary(){
        return Salary*12;
    }

    public String toString(){
        return "Employee [ Id: " + Id + "Full Name:" + FirstName + LastName + "Salary = " + Salary + "]";
    }
}
