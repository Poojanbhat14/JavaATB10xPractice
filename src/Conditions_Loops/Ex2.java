package Conditions_Loops;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("Its even");
        }else {
            System.out.println("Its odd");
        }
    }
}
