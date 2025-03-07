package Feb7thtask;

import java.util.Scanner;

public class factorialofnum {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int fact=1;
        for (int i=Num;i>0;i--){
             fact=fact*i;

        }
        System.out.println(fact);
    }
}
