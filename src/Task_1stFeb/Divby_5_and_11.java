package Task_1stFeb;

import java.util.Scanner;

public class Divby_5_and_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num= sc.nextInt();
        if (num%5==0 && num%11==0){
            System.out.println("number is a multiple of both 5 nd 11");
        }else {
            System.out.println("number is not multiple of both 5 and 11");
        }
    }
}
