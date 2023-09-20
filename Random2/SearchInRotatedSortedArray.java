import java.util.*;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2}; 
        int target = 0;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target){
        int n = nums.length-1;
        int l=0;

        while(l<=n){
            int mid = l+(n-l)/2;
            if(nums[mid] == target) return mid;
            if(nums[l] <= nums[mid]){
                if(nums[l] <= target && target < nums[mid]){
                    n = mid-1;
                }
                else{
                    l = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[n]){
                    l=mid+1;
                }
                else{
                    n=mid-1;
                }
            }
        }
        return -1;
    }
}
