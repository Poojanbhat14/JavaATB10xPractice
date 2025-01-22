package Ternary_op;

public class largestof3 {
    public static void main(String[] args) {
         int a=24;
         int b= 39;
         int c= 56;
         int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);

    }
}
