import java.util.*;

public class SearchInaTwoDmatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 11;
        boolean ans = searchMatrix(a, target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int[][] a, int target){
        int m = a.length;
        int n = a[0].length;

        int low = 0;
        int high =  m*n-1;

        int mid = low + (high-low)/2;
        int row = mid/n;
        int col = mid%n;

        if(a[row][col] == target){
            return true;
        }
        else if(a[row][col] > target){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
        return false;
    }
}
