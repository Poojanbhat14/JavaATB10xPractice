package Exception.CustomException;

public class Finally_NotExecuted_lab_123 {
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.out.println(a);
            System.exit(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("hello Last");
        }
    }
}
