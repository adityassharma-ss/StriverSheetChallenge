import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums){
        int count = 0;
        int element = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(count == 0){
                element = nums[i];
            }
            if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
}

// HashMap approach:

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
        return -1; // No majority element found
    }
}