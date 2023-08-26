import java.util.*;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int [] num1 = new int[]{4, 1, 2};
        int[] num2 = new int[]{1,3,4,2};
        System.out.println(nextGreat(num1, num2));
    }

    private static int[] nextGreat(int[] num1, int[] num2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : num2){
            while(!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
            
            for(int i=0; i<num1.length; i++){
                num1[i] = map.getOrDefault(num1[i],-1);
            }
        }
        return num1;
    }
}
