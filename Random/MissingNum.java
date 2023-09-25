import java.util.*;

public class MissingNum {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1}; // Replace with your array
        int n = nums.length;
        System.out.println(missingNumber(nums, n));
    }
    
    public static int missingNumber(int[] nums, int n) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < n && nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return n;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
