import java.util.*;

public class SetMatrixZeros{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeros(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static void setZeros(int[][] matrix){
        int col0 = 1;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0; i<rows; i++){
            if(matrix[i][0] == 0) col0=0;
            for(int j=1; j<cols; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        for(int i = rows-1; i>=0; i--){
            for(int j = cols-1; j>=1; j--){
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
            }
        }
    }
}