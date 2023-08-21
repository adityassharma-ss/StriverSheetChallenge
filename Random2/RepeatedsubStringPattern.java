import java.util.*;

public class RepeatedsubStringPattern {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(RepeatedsubStringPattern(s));
        System.out.println(RepeatedsubStringPattern2(s));
    }

    public static boolean RepeatedsubStringPattern(String s){
        String doubled = s+s;
        String sub = doubled.substring(1,doubled.length()-1);
        return sub.contains(s);
    }

    private static boolean RepeatedsubStringPattern2(String s){
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                String substring = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();
                for (int j = 0; j < n / i; j++) {
                    repeated.append(substring);
                }
                if (repeated.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
