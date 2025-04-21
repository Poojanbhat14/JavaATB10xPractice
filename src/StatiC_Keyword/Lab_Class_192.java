package StatiC_Keyword;

public class Lab_Class_192 {
    public static void main(String[] args) {
        student s1= new student(34);
        student s3= new student(24);
        System.out.println(student.CourseName);

    }

}

class  student{
    int age;
    static  String CourseName="ATB";

    public student(int age_c){
        this.age=age_c;
    }
}
