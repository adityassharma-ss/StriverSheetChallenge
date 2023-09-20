import java.util.*;

public class RomanToInt {
    public static void main(String[] args) {
        String s = "III";
        int ans = RomanToInt(s);
        System.out.println(ans);
    }

    private static int RomanToInt(String s){
        int ans = 0;
        int[] roman = new int[128];

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        for(int i=0; i<s.length(); i++){
            if(i>0 && roman[s.charAt(i)] > roman[s.charAt(i-1)]){
                ans += roman[s.charAt(i)] - 2*roman[s.charAt(i-1)];
            }else{
                ans += roman[s.charAt(i)];
            }
        }
        return ans;
    }
}
