import java.util.*;

public class LargestSubarrayWithKsum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 9;
        int ans = largestSubarray(nums,k);
        System.out.println(ans);
    }

    public static int largestSubarray(int[] nums, int k){
        int n = nums.length;
        if(nums == null || n == 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            if(sum == k){
                ans = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                ans = Math.max(ans,i-map.get(sum-k));
            }
        }
        return ans;
    }
}
