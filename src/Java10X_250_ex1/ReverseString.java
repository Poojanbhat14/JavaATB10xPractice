package Java10X_250_ex1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Sentence");
        String input = sc.nextLine();
        char[] sentence = input.toCharArray();
        reversewords(sentence);
        System.out.println(new String(sentence));

    }


    public static void reversewords(char[] sentence) {
        reverse(sentence, 0, sentence.length - 1);

        int start = 0;
        for (int end = 0; end < sentence.length; end++) {
            if (sentence[end] == ' ') {
                reverse(sentence, start, end - 1);
                start = end + 1;

            }
        }
        reverse(sentence, start, sentence.length - 1);
    }

    public static void reverse(char arr[], int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
