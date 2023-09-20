public class LongestSubstringWithKNormalChars {
    public static String findLongestSubstring(String A, String B, String C, int k) {
        if (A == null || B == null || C == null || A.isEmpty() || B.isEmpty() || C.isEmpty() || k < 0) {
            return "";
        }

        int n = A.length();
        int left = 0; // Left pointer of the sliding window
        int maxLen = 0;
        int maxStart = 0;
        int normalCount = 0; // Count of normal characters in the current window

        for (int right = 0; right < n; right++) {
            char currentChar = A.charAt(right);

            if (B.indexOf(currentChar) >= 0) {
                if (C.charAt(right) == '0') {
                    normalCount++;
                }

                while (normalCount > k) {
                    if (C.charAt(left) == '0') {
                        normalCount--;
                    }
                    left++;
                }
            }

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                maxStart = left;
            }
        }

        return A.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        String A = "abcde";
        String B = "abc";
        String C = "10100";
        int k = 1;

        String longestSubstring = findLongestSubstring(A, B, C, k);
        System.out.println("Longest substring with at most " + k + " normal characters: " + longestSubstring);
    }
}
