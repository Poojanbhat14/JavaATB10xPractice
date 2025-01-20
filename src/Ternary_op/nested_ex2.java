package Ternary_op;

public class nested_ex2 {
    public static void main(String[] args) {
        int age=8;
        String result =(age<18)?"Minor":(age<65)?"Adult":"Senior";
        System.out.println(result);
    }
}
