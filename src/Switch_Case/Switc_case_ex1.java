package Switch_Case;

import java.util.Scanner;

public class Switc_case_ex1 {
    public static void main(String[] args) {
        System.out.println("Enter te day number 1 to 7");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monady");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
