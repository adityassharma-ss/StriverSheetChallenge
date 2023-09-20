import java.util.*;

public class PrintAllTheDuplicateInAString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        printDuplicates(s);
        printDuplicates2(s);
    }

    private static void printDuplicates(String s){
        int[] count = new int[256];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++){
            if(count[i] > 1){
                System.out.println((char)i + ", count = " + count[i]);
            }
        }
    }

    private static void printDuplicates2(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ", count = " + entry.getValue());
            }
        }
    }
}
