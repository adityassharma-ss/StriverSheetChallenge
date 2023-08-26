import java.util.*;

public class RedundantConnection{
    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,3}};
        System.out.println(Arrays.toString(findRedundantConnection(edges)));
    }

    private static int[] findRedundantConnection(int[][] edges){
        int[] parent = new int[edges.length+1];
        for(int i=0; i<parent.length; i++){
            parent[i] = i;
        }

        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            if(find(parent, u) == find(parent, v)){
                return edge;
            }
            else{
                union(parent, u, v);
            }
        }
        return new int[0];
    }

    private static int find(int[] parent, int i){
        if(parent[i] == i){
            return i;
        }
        return find(parent, parent[i]);
    }

    private static void union(int[] parent, int u, int v){
        int uParent = find(parent, u);
        int vParent = find(parent, v);
        if(uParent != vParent){
            parent[uParent] = vParent;
        }
    }
}