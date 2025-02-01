package Task_30jan;

import java.util.Scanner;

public class Largestof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int N1= sc.nextInt();
        int N2= sc.nextInt();
        int N3= sc.nextInt();
        if (N1>N2 && N2>N3){
            System.out.println("The large one is" + N1);
        }else if(N2>N1 && N1>N3){
            System.out.println("The large one is" + N2);
        }else {
            System.out.println("The large one is " + N3);
        }
    }
}
