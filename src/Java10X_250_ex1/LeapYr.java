package Java10X_250_ex1;

import java.util.Scanner;

public class LeapYr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean IsleapYr=false;
        System.out.println("Enter the year202");
        int YR=sc.nextInt();
        if ((YR%4==0 && YR%100!=0)||(YR%400==0)){
            IsleapYr=true;
        }
        if (IsleapYr){
            System.out.println(YR + "Is a Leap Year");
        }else {
            System.out.println(YR + "Is not a Leap year");
        }
    }
}
