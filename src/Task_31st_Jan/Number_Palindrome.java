package Task_31st_Jan;

import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int rev=0;

        while (num!=0){
            rev=(rev*10) +(num%10);
            num=num/10;
        }
        System.out.println("reverse="+rev);
if(rev==num){
    System.out.println("number is palindrome");
}else {
    System.out.println("not a palindrome");
}

        }
    }

