package Exception;

public class Lab_211 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=a/b;
        String s1=null;
        try {
            s1.trim();
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }catch (NullPointerException e){
            System.out.println("Exception");
        }
    }
}
