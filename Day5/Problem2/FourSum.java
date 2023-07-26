import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums,target);
        System.out.println(ans);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums == null || n < 4) return ans;
        for(int i=0; i<n-3;i++){
            if(i==0 || nums[i] > nums[i-1]){
                for(int j=i+1; j<n-2; j++){
                    if( j == i+1 || nums[j] > nums[j-1]){
                        int left = j+1;
                        int right = n-1;
                        while(left < right){
                            int sum = nums[i] + nums[j] + nums[left] + nums[right];
                            if(sum ==  target){
                                List<Integer> temp = new ArrayList<>();
                                temp.add(nums[i]);
                                temp.add(nums[j]);
                                temp.add(nums[left]);
                                temp.add(nums[right]);
                                ans.add(temp);
                                left++;
                                right--;
                                while(left < right && nums[left] == nums[left-1]) left++;
                                while(left < right && nums[right] == nums[right+1]) right--;
                            }
                            else if(sum < target){
                                left++;
                            }
                            else{
                                right--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}

