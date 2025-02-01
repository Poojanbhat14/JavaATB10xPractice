package Task_30jan;

import java.util.Scanner;

public class Triangle_validity {
    public static void main(String[] args) {
        System.out.println("Enter the sides of triangle");
        Scanner sc= new Scanner(System.in);
        int S1= sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if(S1>0&&s2>0&&s3>0){
            System.out.println("Valid Triangle");
        }else {
            System.out.println("invalid Traingle");
        }
    }
}
