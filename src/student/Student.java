package student;

public class Student {
    private String name= "John";
    private String classes = "C02";
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

     protected void setName(String name) {
        this.name = name;
    }

    protected   void setClasses(String classes) {
        this.classes = classes;
    }
}
