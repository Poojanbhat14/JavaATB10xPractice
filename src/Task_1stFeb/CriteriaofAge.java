package Task_1stFeb;

import java.util.Scanner;

public class CriteriaofAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("Invalid");
        }
       else if (age > 0 && age < 13) {
                System.out.println("Child");
            } else if (age > 12 && age < 20) {
                System.out.println("Teen");
            } else if (age > 19 && age < 65) {
                System.out.println("adult");
            } else {
                System.out.println("Senior citizen");
            }
        }
    }
