package Feb7thtask;

import java.util.Scanner;

public class multipleofgivennum {
    public static void main(String[] args) {


        System.out.println("Enter the number");
        Scanner number=new Scanner(System.in);
        int n=number.nextInt();
        int m=1;
        for (int i=1;i<=10;i++){
            m=n*i;
            System.out.printf("%d*%d="+m,n,i);
        }

    }
}
