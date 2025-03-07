package Feb7thtask;

public class PyramidPattern {
    public static void main(String[] args) {
        int rows=5;
        for (int i=1;i<=rows;i++)
        {
            for (int j=i;j<=rows-1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
