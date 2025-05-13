package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_234 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<String> name=new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();

        String ContinueIn="Y";

        while (ContinueIn.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter the name");
            String Name=sc.nextLine();
            name.add(Name);

            System.out.println("Enter the Age");
            Integer Age=sc.nextInt();
            age.add(Age);

            sc.nextLine();
            System.out.println("Do u want to continue? (Y/N)");
            ContinueIn=sc.nextLine();

        }
        for (Object P:name){
            System.out.println(name);

        }
        for (Object Q:age){
            System.out.println(age);
        }
        sc.close();
    }
}
