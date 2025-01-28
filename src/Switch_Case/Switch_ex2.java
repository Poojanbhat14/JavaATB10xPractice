package Switch_Case;

import java.util.Scanner;

public class Switch_ex2 {
    public static void main(String[] args) {
        System.out.println("enter the browser needed");
        Scanner sc=new Scanner(System.in);
        String browser= sc.next();
        switch (browser){
            case "chrome":
                System.out.println("Chrome");
                break;
            case "Firefox":
                System.out.println("Firefox");
                break;
            case "Edge":
                System.out.println("Edge");
               break;
            default :
                System.out.println("I have no idea");
        }

    }
}
