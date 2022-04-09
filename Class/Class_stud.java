package Class;

public class Class_stud {
    private int id;
    private String classname;

    public Class_stud(int id, String classname){
        this.id = id;
        this.classname = classname;
    }

    public int getId() {
        return id;
    }

    public String getClassname() {
        return classname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
    public String toString(){
        return id + classname;
    }
}
