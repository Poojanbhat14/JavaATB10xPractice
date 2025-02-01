package Task_30jan;

import java.util.Scanner;

public class ATM_withdraw {
    public static void main(String[] args) {
        final int balance=10000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount to be removed");
        int amnt=sc.nextInt();
    if(amnt>balance|| amnt<0) {
        System.out.println("Balance insufficeint or Invalid amount");
   sc.close();
    }

        if (amnt%100==0) {
            System.out.println("The Amount is deducted");
            System.out.println("Remainig balance is" + (balance-amnt));
        }else {
            System.out.println("Please enter amount multiple of 100");
        }
    }
}
