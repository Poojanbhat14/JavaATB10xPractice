package Conditions_Loops;

import java.util.Scanner;

public class Triangleclassifier
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side1");
        double side1 = sc.nextDouble();
        System.out.println("enter the side2");
        double side2 = sc.nextDouble();
        System.out.println("enter the side2");
        double side3 = sc.nextDouble();
        if (side1 < 1 || side2 < 1 || side3 < 1) {
            System.out.println("Invalid");
        } else {
            if (side1 == side2 && side2 == side3 && side3 == side1) {
                System.out.println("Equilateral");

            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("isosceles");
            } else {
                System.out.println("Scalen");
            }
            sc.close();
        }
    }
}
