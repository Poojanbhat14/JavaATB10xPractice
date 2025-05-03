package Exception;

public class java_214 {
    public static void main(String[] args) {
        final  double pi=3.14;
        int a=0;
        try {
            int b=10/a;
        } catch (Exception e) {
            System.out.println("it cant be run");
        } finally {
            System.out.println("Finally i am out");
        }
    }
}
