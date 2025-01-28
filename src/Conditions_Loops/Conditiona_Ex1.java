package Conditions_Loops;

import java.util.Scanner;

public class Conditiona_Ex1 {
    public static void main(String[] args) {
        System.out.println("Enter the age ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Allowed to Vote");
        }else {
            System.out.println("Not allowed");
        }
    }
}