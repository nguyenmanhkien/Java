package Class;

import java.util.Date;

public class Stud {
    private int rollno;
    private String name;
    private Date dob;
    private String Classcurent;
    private int status;

    public Stud(int rollno, String name, Date dob,Class_stud myclass, int status){
        this.rollno= rollno;
        this.dob = dob;
        this.Classcurent = String.valueOf(myclass);
        this.status= status;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getClasscurent() {
        return Classcurent;
    }

    public int getStatus() {
        return status;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setClasscurent(String classcurent) {
        this.Classcurent = classcurent;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String toString(){
        return "Rollno: "+ rollno+ " Name: "+ name + " Class: " + Classcurent + " Date of birth: " + dob +" Status: "+ status;
    }
}
