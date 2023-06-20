import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums){
        int max = nums[0];
        int sum = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum > max) max = sum;
        }
        return max;
    }
}

// The Kadane's algorithm, also known as the maximum subarray sum algorithm, is an efficient algorithm used to find the maximum sum of a contiguous subarray within a given array of numbers. It is particularly useful when dealing with problems related to finding the maximum sum subarray.