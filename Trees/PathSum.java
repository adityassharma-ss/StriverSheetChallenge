import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(3);
        root.right = right;
        TreeNode left1 = new TreeNode(5);
        left.right = left1;
        System.out.println(hasPathSum(root, 8));
    }

    private static boolean hasPathSum(TreeNode root, int target){
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == target) return true;
        return hasPathSum(root.left, target - root.val) || hasPathSum(root.right, target - root.val);
    }
}
