package Author;

public class Test_Author {
    public static void main(String[] args){
        Author ahTech = new Author("Tan Ah Teck","teck@nowhere.com",'m');
        System.out.println(ahTech);

        ahTech.setEmail("teck@somewhere.com");
        System.out.println(ahTech);

        System.out.println("name is: " + ahTech.getName());
        System.out.println("gender is: " + ahTech.getGender());
        System.out.println("email is: " + ahTech.getEmail());
    }
}
