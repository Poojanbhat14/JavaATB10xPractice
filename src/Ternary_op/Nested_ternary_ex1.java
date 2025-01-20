package Ternary_op;

public class Nested_ternary_ex1 {
    public static void main(String[] args) {
int n1= 28,n2=34,n3=76;
int max = (n1>n2)?((n1>n3)?n1:n3):((n2>n3)? n2 : n3);
        System.out.println(max);
    }
}
