package Java10X_250_ex1;

public class Ex1_jan19 {
    public static void main(String[] args) {
        int max=100;
        int score= Integer.parseInt(args[0]);
        String result = (score>max?"invalid":(score>=90?"A grade":(score>=80?"B grade":(score>=70?"C Grade":(score>=60?"D Grade":"F Grade")))));
        System.out.println(result);
    }
}
