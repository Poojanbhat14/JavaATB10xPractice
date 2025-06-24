package Java10X_250_ex1;

import java.util.Scanner;

public class Ex4_Palindrome {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter the Word");
        String Word1=s1.nextLine();
        String rev="";
        for (int i=Word1.length()-1;i>=0;i--){
            rev=rev+Word1.charAt(i);

        }
        System.out.println(rev);
        if (Word1.equals(rev)){
            System.out.println(Word1 +"Is a Palindrome");
        }else {
            System.out.println(Word1 + "Is not a Palindrome");
        }
    }
}
