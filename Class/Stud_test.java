package Class;

import java.util.Date;

public class Stud_test {
    public static void main(String[] args) {
        Date d1 = new Date(29,1,2003);
        Class_stud c1 = new Class_stud(22," T2109M ");
        Stud s1 = new Stud(1,"Nguyen Manh Kien",d1,c1,3);
        System.out.println(s1);
    }
}
