import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] nums){
        int n = nums.length;
        if(nums ==  null || n == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int ans = 0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int curr = num;
                int streak = 1;
                while(set.contains(curr+1)){
                    curr += 1;
                    streak += 1;
                }
                ans = Math.max(ans,streak);
            }
        }
        return ans;
    }
}
