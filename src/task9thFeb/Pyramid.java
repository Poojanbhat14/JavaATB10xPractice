package task9thFeb;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int lenth = sc.nextInt();
        int [] numbers= new int[lenth];
        for (int i=1;i<=lenth;i++){
            for (int k=1;k<=lenth-i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
