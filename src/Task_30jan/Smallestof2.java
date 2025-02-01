package Task_30jan;

import java.util.Scanner;

public class Smallestof2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int N1= sc.nextInt();
        int N2 = sc.nextInt();
        if(N1<N2){
            System.out.println("Smallest is" + N1);
        }else {
            System.out.println("Smallest is " + N2);
        }
    }
}
