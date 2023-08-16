import java.util.*;

public class topsort {
    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] inDegree = new int[V];
        Queue<Integer> queue = new LinkedList<>();
        int[] topologicalOrder = new int[V];
        int index = 0;

        // Calculate in-degrees
        for (ArrayList<Integer> neighbors : adj) {
            for (int v : neighbors) {
                inDegree[v]++;
            }
        }

        // Enqueue vertices with in-degree 0
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        // Process queue
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topologicalOrder[index++] = u;

            for (int v : adj.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        return topologicalOrder;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(0);
        adj.get(2).add(0);
        adj.get(3).add(0);

        int[] topologicalOrder = topoSort(V, adj);
        for (int v : topologicalOrder) {
            System.out.print(v + " ");
        }
    }
}
