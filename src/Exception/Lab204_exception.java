package Exception;

public class Lab204_exception {
    public static void main(String[] args) {
        //int a=10;
        //int b=0;
        try {
            int c=10/2;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("1");

    }
}
