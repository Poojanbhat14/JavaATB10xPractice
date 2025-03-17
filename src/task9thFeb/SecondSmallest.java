package task9thFeb;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] numbers= new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter the number");
            numbers[i]=sc.nextInt();
        }
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("Second Smallest number");
        System.out.println(numbers[numbers.length-numbers.length+1]);
    }
}
