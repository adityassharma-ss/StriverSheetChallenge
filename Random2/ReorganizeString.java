import java.util.*;

public class ReorganizeString {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println("result: "+reorganizeString(s));
    }

    private static String reorganizeString(String s){
        int n=s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<int[]> max = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            max.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        StringBuilder result = new StringBuilder();
        int[] prev = new int[]{'#',0};

        while(!max.isEmpty()){
            int[] current = max.poll();
            result.append((char) current[0]);

            if(prev[1]>0){
                max.offer(prev);
            }

            current[1]--;
            prev = current;
        }

        if(result.length() != s.length()){
            return "";
        }

        return result.toString();
        
    }
}
