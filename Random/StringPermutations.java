import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);
        
        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
    
    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper("", input, permutations);
        return permutations;
    }
    
    private static void generatePermutationsHelper(String prefix, String remaining, List<String> permutations) {
        int n = remaining.length();
        
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsHelper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n), permutations);
            }
        }
    }
}
