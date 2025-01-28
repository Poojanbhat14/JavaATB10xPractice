package Conditions_Loops;

import java.util.Scanner;

public class Scorewith_Condition {
    public static void main(String[] args) {
        System.out.println("Enter the score");
        Scanner sc=new Scanner(System.in);
        float score= sc.nextFloat();
        if(score>100){
            System.out.println("Invalid Score");
        } else if (score>89) {
            System.out.println("A Grade");

        } else if (score>79) {
            System.out.println("B Grade");

        }else if (score>69) {
            System.out.println("C Grade");
    }else if (score>59) {
            System.out.println("D Grade");
        }else {
            System.out.println("fail");
        }
    }
}
