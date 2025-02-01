package Java10X_250_ex1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name to check palindrome");
        String name= sc.next();
        String rev ="";
        for (int i=0;i<name.length();i++){
 char ch= name.charAt(i);
  rev=ch+rev;
        }
        System.out.println(rev);
if (rev.equals(name)){
            System.out.println("Name is a palindrome");
        }else {
    System.out.println("name is not a palindrome");
}
    }
}
