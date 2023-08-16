import java.util.*;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] res = maxSlidingWindow(nums, k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[n-k+1];

        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i<n; i++){
            while(!deque.isEmpty() && deque.peek() < i-k+1){
                deque.poll();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i-k+1 >= 0){
                result[i-k+1] = nums[deque.peek()];
            }
        }
        return result;
    }
}
