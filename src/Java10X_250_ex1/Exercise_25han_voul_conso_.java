package Java10X_250_ex1;

import java.util.Scanner;

public class Exercise_25han_voul_conso_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name to find Vowels and Consonents in it :");
        String str = sc.next();

        int Vowel = 0;
        int Conso = 0;


        for (int i = 0; i <str.length() ; i++) {

            if (str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u') {
                Vowel++;
            }
            else {
                Conso++;
            }

        }
        System.out.println("Total Vowel characters are "+Vowel);
        System.out.println("Total Consonent characters are "+Conso);
    }
}
