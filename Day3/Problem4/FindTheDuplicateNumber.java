import java.util.*;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicate2(nums));
        System.out.println(findDuplicate3(nums));
        System.out.println(findDuplicate4(nums));
    }

    public static int findDuplicate(int[] nums){ // Brute Force Approach
        for(int i = 0; i< nums.length; i++){
        for(int j = i + 1; j < nums.length; j++){
            if(nums[i] == nums[j]){
                return nums[i];
            }
        }
    }
    return nums.length;
    }

    public static int findDuplicate2(int[] nums){ // Using Sorting
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return nums.length;
    }

    public static int findDuplicate3(int[] nums){ // Using HashSet
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static int findDuplicate4(int[] nums){ // Using Floyd's Tortoise and Hare (Cycle Detection)
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
