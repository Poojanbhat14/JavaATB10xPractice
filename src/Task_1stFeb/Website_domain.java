package Task_1stFeb;

import java.util.Scanner;

public class Website_domain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the website link");
        String link= sc.next();

        if (link.contains(".com")){
            System.out.println("The website type is: Commercial website");

        } else if (link.contains(".org")) {
            System.out.println("The website type is: Non-profit organization");

        } else if (link.contains(".edu")) {

            System.out.println("The website type is: Educational institution");
        }else if (link.contains(".gov")){
            System.out.println("The website type is: Government website");
        } else if (link.contains(".net")) {

            System.out.println("The website type is: Network-related website");
        } else if (link.contains(".info")) {
            System.out.println("The website type is: Informational website");
        } else if (link.contains(".xyz")) {
            System.out.println("The website type is: Unknown or other types of websites");
        }else {
            System.out.println("Invalid link");
        }
    }
}
