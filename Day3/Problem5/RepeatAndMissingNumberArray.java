import java.util.*;

public class RepeatAndMissingNumberArray {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(3);
        System.out.println(repeatedNumber(A));
    }

    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = A.size();
        long sum = (long) n * (n + 1) / 2;
        long squareSum = (long) n * (n + 1) * (2 * n + 1) / 6;
        // Calculate the actual sum and square sum of the elements in the array
        long actualSum = 0;
        long actualSquareSum = 0;
        for (int num : A) {
            actualSum += num;
            actualSquareSum += (long) num * num;
        }
        // Find the difference between expected and actual sums
        long diffSum = actualSum - sum;
        long diffSquareSum = actualSquareSum - squareSum;
        long sumAB = diffSquareSum / diffSum;
        int repeatedNumber = (int) ((diffSum + sumAB) / 2);
        int missingNumber = (int) (sumAB - repeatedNumber);
        result.add(repeatedNumber);
        result.add(missingNumber);
        
        return result;
    }
}
