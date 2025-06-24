package Java10X_250_ex1;

import java.util.Scanner;

public class GradeforMarks {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        if (marks>=90 && marks<=100) {
            System.out.println("Grade is A");
        }
            else if (marks>=80 && marks<=89){
                System.out.println("grade is B");
            } else if (marks>=70 && marks<=79) {
                System.out.println("Grade is C");
                
            } else if (marks>=60 && marks<=69) {
                System.out.println("Grade is D");

            } else if (marks>=0 && marks<=59) {
                System.out.println("Grade is F");
            }else {
                System.out.println("Invalid Marks");
            }
        }
    }

