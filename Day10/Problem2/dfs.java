import java.util.*;

public class dfs {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        System.out.println(dfs(v, adj));
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }

    public static ArrayList<Integer> dfs(int v,  ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] visited = new boolean[v];
        for(int i=0; i<v; i++){
            if(!visited[i]){
                dfsUtil(i, adj, visited, res);
            }
        }
        return res;
    }
    
    public static void dfsUtil(int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> res){
        visited[v] = true;
        res.add(v);
        for(int i : adj.get(v)){
            if(!visited[i]){
                dfsUtil(i, adj, visited, res);
            }
        }
    }    
}
