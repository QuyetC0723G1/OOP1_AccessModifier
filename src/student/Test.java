package student;

import student.Student;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Quyet");
        st1.setClasses("C07");
        Student st2 = new Student();
        System.out.println(st1);
        System.out.println(st2);
    }
}
