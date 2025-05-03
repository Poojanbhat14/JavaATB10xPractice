package Exception;

import java.util.Scanner;

public class Lab_213 {
    public static void main(String[] args) {
        Scanner sc= null;
        sc=new Scanner(System.in);
        int V= sc.nextInt();
            try {
                int a=10/0;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                sc.close();
                System.out.println("Closing");
            }
        }

    }
