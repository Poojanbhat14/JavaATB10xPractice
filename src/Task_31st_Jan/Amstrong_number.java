package Task_31st_Jan;

import java.util.Scanner;

public class Amstrong_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int N= sc.nextInt();
        int sum=0;
        while (N!=0){
            sum=sum+(N%10);
        }
    if (sum==N){
        System.out.println("Number is Amstrong");
    }else {
        System.out.println("Noy a Amstrong");
    }
    }
}
