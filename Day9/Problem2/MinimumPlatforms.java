import java.util.*;

public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        
        int platforms = minPlatformsNeeded(arr, dep, n);
        System.out.println(platforms);
    }

    public static int minPlatformsNeeded(int[] arr, int[] dep, int n){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platforms = 1;
        int current = 1;
        int arrival = 1;
        int departure = 0;

        while(arrival < n && departure < n){
            if(arr[arrival] <= dep[departure]){
                current++;
                arrival++;
            }else{
                current--;
                departure++;
            }
            platforms = Math.max(platforms, current);
        }
        return platforms;
    }
}
