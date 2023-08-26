import java.util.*;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;
        TreeNode left1 = new TreeNode(5);
        left.right = left1;
        System.out.println(binaryTreePaths(root));
    }

    private static List<Integer> binaryTreePaths(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        dfs(root, result, "");
        return result;
    }

    private static void dfs(TreeNode root, List<Integer> result, String path){
        if(root.left == null && root.right == null){
            path += root.val;
            result.add(path);
            return;
        }
        path += root.val + "->";
        if(root.left != null) dfs(root.left, result, path);
        if(root.right != null) dfs(root.right, result, path);
    }
}
