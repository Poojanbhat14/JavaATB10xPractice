package Task_30jan;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the score");
        int score=sc.nextInt();
        if (score<0 || score>100){
            System.out.println("Invalid");
        }if (score>=90){
            System.out.println("The grade is A+");
        }else if (score>=80){
            System.out.println("The grade is A");
        } else if (score>=70) {
            System.out.println("Grade is B");
        } else if (score>=60) {
            System.out.println("The grade is C");
        } else if (score>=50) {
            System.out.println("The grade is D");

        }else if(score>=40){
            System.out.println("The grade is E");
        }else {
            System.out.println("Fail");
        }
    }
}
