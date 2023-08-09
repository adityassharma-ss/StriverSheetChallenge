import java.util.*;

public class SubArrayWithGivenXOR{
    public static void main(String[] args) {
        int[] nums = {4,2,2,6,4};
        int k = 6;
        int ans = subarrayXOR(nums,k);
        System.out.println(ans);
    }

    public static int subarrayXOR(int[] nums, int k){
        int n = nums.length;
        if(nums == null || n == 0){
            return 0;
        }
        Map<Integer,Integer> map = new HashMap<>();
        int xor = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            xor ^= nums[i];
            if(xor == k){
                ans++;
            }
            if(!map.containsKey(xor)){
                map.put(xor,i);
            }
            if(map.containsKey(xor^k)){
                ans += map.get(xor^k);
            }
        }
        return ans;
    }
}