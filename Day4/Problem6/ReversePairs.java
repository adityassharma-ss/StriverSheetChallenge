import java.util.*;

public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        int ans = reversePairs(nums);
        System.out.println(ans);
    }

    public static int reversePairs(int[] nums){
        int n = nums.length;
        int res = reverse(nums,0,n-1);
        return res;
    }

    public static int reverse(int[] nums, int i, int j){
        int res = 0;
        if(i<j){
            int mid = (i+j)/2;
            res += reverse(nums,i,mid);
            res += reverse(nums,mid+1,j);
            res += merge(nums,i,mid,j);
        }
        return res;
    }

    public static int merge(int[] nums, int l, int m, int r){
        int res = 0;
        int[] left = Arrays.copyOfRange(nums,l,m+1);
        int[] right = Arrays.copyOfRange(nums,m+1,r+1);
        int i = 0, j = 0, k = l;
        while(i<left.length && j<right.length){
            if(left[i] <= right[j]){
                nums[k++] = left[i++];
            }else{
                nums[k++] = right[j++];
                res += m+1-(l+i);
            }
        }
        while(i<left.length){
            nums[k++] = left[i++];
        }
        while(j<right.length){
            nums[k++] = right[j++];
        }
        return res;
    }
}
