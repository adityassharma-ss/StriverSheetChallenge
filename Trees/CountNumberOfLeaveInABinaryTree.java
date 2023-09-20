import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class CountNumberOfLeaveInABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        TreeNode left = new TreeNode(10);
        root.left = left;
        TreeNode right = new TreeNode(15);
        root.right=right;
        TreeNode left1 = new TreeNode(11);
        left.left = left1;
        System.out.println(NumberOfLeaves(root));
    }

    private static int NumberOfLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        return NumberOfLeaves(root.left) + NumberOfLeaves(root.right);
    }
}
