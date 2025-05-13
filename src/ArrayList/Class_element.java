package ArrayList;

import java.util.*;

public class Class_element {
    public static void main(String[] args) {
        Student s1=new Student("Amol",22);
        Student s2=new Student("Priya",62);
        Student s3=new Student("Rajeev",76);
        Student s4=new Student("Yavan",89);

        List<Student> myStudent=new Stack<>();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        myStudent.add(s4);
        System.out.println(myStudent);
        s1.PrintDetails();



    }
}
