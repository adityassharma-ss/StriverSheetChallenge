import java.util.*;

public class DuplicateCharactersInAString {
    public static void main(String[] args) {
        String str = "gfg";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character c : set) {
            if (map.get(c) > 1) {
                System.out.println(c + " " + map.get(c));
            }
        }
    }
}
