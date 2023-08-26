import java.util.*;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        System.out.println(backspaceCompare(S, T));
    }

    private static boolean backspaceCompare(String S, String T){
        int n = s.length();
        int m = t.length();
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for(int i=0; i<n; i++){
            if(!s1.isEmpty() && s.charAt(i) == '#'){
            s1.pop();
        }
        else if(s.charAt(i) == '#'){
        }
        else{
            s1.push(s.charAt(i));
        }
        }

        for(int i=0; i<m; i++){
            if(!s2.isEmpty() && t.charAt(i) == '#'){
                s2.pop();
            }
            else if(t.charAt(i) == '#'){

            }
            else{
                s2.push(t.charAt(i));
            }
        }

        return s1.equals(s2);
    }
}
