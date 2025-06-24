package Java10X_250_ex1;

import java.util.Scanner;

public class Primechecker {
    public  static  boolean isPrime(int num) {
        if (num <= 1) {
            return false;

        }
        if (num <= 3) {
            return true;
        }if (num %2==0 || num%3==0){
            return false;
        }
        for ( int i=5;i*i<=num;i+=6){
            if (num%2==0 || num%(i*2)==0){
                return  false;
            }
        }
        return  true;
    }


public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num= sc.nextInt();
    sc.close();

    if(isPrime(num)){
        System.out.println(num + "is a Prime number");
    }else {
        System.out.println(num + "is  not a prime numner");
    }
}
}
