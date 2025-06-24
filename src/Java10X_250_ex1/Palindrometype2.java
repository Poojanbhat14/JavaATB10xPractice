package Java10X_250_ex1;

import java.util.Locale;
import java.util.Scanner;

public class Palindrometype2 {
    public  static  boolean isplin(String str){
        str=str.toLowerCase();
        for (int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if (start!=end){
                return  false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the String");
        String input=sc.nextLine();
        if (isplin(input)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
