import java.util.*;

public class IsGraphBipartite {
    public static void main(String[] args) {
        int[][] graph = {{1,3}, {0,2}, {1,3}, {0,2}};
        System.out.println(isBipartite(graph));
    }

    private static boolean isBipartite(int[][] graph){
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1);

        for(int i = 0; i < n; i++){
            if(colors[i] == -1 && !isValid(graph, colors, 0, i)){
                return false;
            }
        }
        return true;
    }

    private static boolean isValid(int[][] graph, int[] colors, int color, int node){
        if(colors[node] != -1){
            return colors[node] == color;
        }

        colors[node] = color;

        for(int next : graph[node]){
            if(!isValid(graph, colors, 1 - color, next)){
                return false;
            }
        }
        return true;
    }
}
