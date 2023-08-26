import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class DiameterOfBinaryTree {
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
        System.out.println(diameterOfBinaryTree(root));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root, diameter);
        return diameter[0];        
    }

    private static int height(TreeNode node, int[] diameter) {
        if(node == null) return 0;
        int l = height(node.left, diameter);
        int r = height(node.right, diameter);
        diameter[0] = Math.max(diameter[0], l+r);
        return Math.max(l,r) + 1;
    }
}
