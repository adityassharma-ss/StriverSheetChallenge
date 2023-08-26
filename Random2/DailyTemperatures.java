import java.util.*;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {30,40,50,60};
        int[] result = temperature(temperatures);
        for (int num : result) {
            System.out.print(num);
    }
}

    private static int[] temperature(int[] temperatures){
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                ans[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }
        
        return ans;
    }
}
