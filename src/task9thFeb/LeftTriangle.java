package task9thFeb;

import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int lenth = sc.nextInt();
        int [] numbers= new int[lenth];
        for (int i=lenth;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
