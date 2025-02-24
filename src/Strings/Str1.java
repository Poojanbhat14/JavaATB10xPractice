package Strings;

public class Str1 {
    public static void main(String[] args) {
        String st1="hello";
        String st2 ="hello";
        String st3 =new String("hello");
        System.out.println(st1==st2);
        System.out.println(st1== st3);
        System.out.println(st1.equals(st3));
    }
}
