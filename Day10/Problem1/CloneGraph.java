import java.util.*;

class Node{
    int val;
    ArrayList<Node> neighbours;

    public Node(){
        this.val = 0;
        this.neighbours = new ArrayList<>();
    }

    public Node(int val){
        this.val = val;
        this.neighbours = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbours){
        this.val = val;
        this.neighbours = neighbours;
}

public class CloneGraph {
    public static void main(String[] args) {
        Node node = new Node();
        Node ans = CloneGraph(node);
        System.out.println(ans);
    }

    private static Node CloneGraph(Node node){
        if(node == null) return null;
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    private static Node dfs(Node node, Map<Node, Node> map){
        if(map.containsKey(node)) return map.get(node);
        Node copy = new Node(node.val,new ArrayList<>());
        map.put(node, copy);
        for(Node neighbour : node.neighbours){
            copy.neighbours.add(dfs(node, map));
        }
        return copy;
    }
}
}