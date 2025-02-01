package Task_30jan;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int Year = sc.nextInt();
        if (Year%4==0){
            System.out.println("The yesr is leap yesr");
        }else {
            System.out.println(" Yesr is not a leap year");
        }
    }
}
