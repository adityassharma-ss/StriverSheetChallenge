package Day2.Problem2;
import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals){
        int n = intervals.length;
        if(n <= 1 || intervals == null){
            return new int[0][];
        }

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> result = new ArrayList<>();
        int[] new = intervals[0];

        

    }
}
