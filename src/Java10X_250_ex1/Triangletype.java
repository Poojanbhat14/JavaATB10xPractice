package Java10X_250_ex1;

import java.util.Scanner;

public class Triangletype {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sides");
        int s1= sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        if(s1==s2&&s2==s3&&s3==s1){
            System.out.println("equilateral triangle");
        } else if (s1==s2 || s2==s3 || s3==s1) {
            System.out.println("Iscosceles  Triangle");

        }else {
            System.out.println("Scalene Tringle");
        }
    }
}
