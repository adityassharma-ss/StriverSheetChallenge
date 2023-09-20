import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;
        TreeNode left1 = new TreeNode(4);
        left.left = left1;
        TreeNode right1 = new TreeNode(5);
        left.right = right1;
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < size; ++i){
                TreeNode current = q.remove();
                currentLevel.add(current.val);
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
