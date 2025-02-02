package Task_1stFeb;

import java.util.Scanner;

public class yrs_month_days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the days");
        int days= sc.nextInt();
        int yrs=0;
        int month =0;
        int day=0;
        if (days>0){
            yrs=days/365;
            month=((days%365)/30);
            day=((days%365)%30);

            System.out.printf("%d years %d months %d days", yrs,month,day);

    }else{
        System.out.println("Invalid");
    }
}}
