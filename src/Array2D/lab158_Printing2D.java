package Array2D;

public class lab158_Printing2D {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{-45,56,4},{4,89,52}};
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println();
        }
    }
}
