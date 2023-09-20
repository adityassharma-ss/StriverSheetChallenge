import java.util.*;

public class ExtraCharactersInAString {
    public static void main(String[] args) {
        String s = "leetcode";
        String[] dictionary = {"leet", "code", "leetcode"};
        System.out.println(extraCharacters(s, dictionary));
    }

    private static int extraCharacters(String s, String[] dictionary){
        int maxVal = s.length() + 1;
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, maxVal);
        dp[0] = 0;

        Set<String> set = new HashSet<>(Arrays.asList(dictionary));

        for (int i = 1; i <= s.length(); ++i) {
            dp[i] = dp[i - 1] + 1;
            for (int l = 1; l <= i; ++l) {
                if (set.contains(s.substring(i - l, i))) {
                    dp[i] = Math.min(dp[i], dp[i - l]);
                }
            }
        }
        return dp[s.length()];
    }
}
