import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class MaxDepthOfBinartTree {
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
        System.out.println(heightofBinaryTree(root));
    }
    private static int heightofBinaryTree(TreeNode root){
        if(root == null) return 0;
        int l = heightofBinaryTree(root.left);
        int r = heightofBinaryTree(root.right);

        return Math.max(l,r) + 1;

    }

}
