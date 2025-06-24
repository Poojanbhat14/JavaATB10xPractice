package Java10X_250_ex1;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
