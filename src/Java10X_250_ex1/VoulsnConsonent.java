package Java10X_250_ex1;

import java.util.Scanner;

public class VoulsnConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int vcounnt = 0;
        int ccount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcounnt++;
            } else if (ch >= 'a' && ch <= 'z') {
                ccount++;
            }

        }
        System.out.println("number ov Voueles" +vcounnt);
        System.out.println("nuber of Consonent" +ccount);
    }
}

