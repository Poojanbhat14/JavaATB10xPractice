package Exception;

public class lab_206 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        try {
            int c=a/b;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
