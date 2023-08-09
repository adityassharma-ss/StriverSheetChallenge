import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        if(s == null || n == 0){
            return 0;
        }
        int j = 0, len = 0;
        Set<Character> set = new HashSet<>();
        for(int i=0; i<n; i++){
            while(j<n && set.add(s.charAt(j))){
                j++;
            }
            len = Math.max(len,j-i);
            set.remove(s.charAt(i));
        }
        return len;
    }
}
