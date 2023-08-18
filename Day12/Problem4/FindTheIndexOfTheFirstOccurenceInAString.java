import java.util.*;

public class FindTheIndexOfTheFirstOccurenceInAString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
    if (needle.length() == 0 || haystack.length() < needle.length()) {
        return -1;
    }
        // Iterate over the haystack and compare each substring of the same length as the needle with the needle
    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
        String substring = haystack.substring(i, i + needle.length());
        if (substring.equals(needle)) {
            return i;
        }
    }

    // If the loop completes without finding a match, return -1
    return -1;
    }
}
