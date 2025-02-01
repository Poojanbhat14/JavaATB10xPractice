package Task_30jan;

import javax.xml.transform.Source;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
    int num= sc.nextInt();
    if (num%1==0 && num%num==0){
        System.out.println("The number is prime");
    }else {
        System.out.println("The number is not prime");
    }
    }
}
