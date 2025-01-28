package Conditions_Loops;

import java.util.Scanner;

public class MultiCondition {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.printf("%d is greater",num1);
        } else if (num2>num1) {
            System.out.printf("%d is greater",num2);

        }else {
            System.out.println("num1=num2");
        }
    }
}

