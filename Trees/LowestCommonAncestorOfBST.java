import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class LowestCommonAncestorOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(8);
        root.right = right;
        TreeNode left1 = new TreeNode(0);
        left.left = left1;
        TreeNode right1 = new TreeNode(4);
        left.right = right1;
        TreeNode left2 = new TreeNode(7);
        right.left = left2;
        TreeNode right2 = new TreeNode(9);
        right.right = right2;
        TreeNode left3 = new TreeNode(3);
        right1.left = left3;
        TreeNode right3 = new TreeNode(5);
        right1.right = right3;
        System.out.println(lowestCommonAncestor(root, left, right));
    }

    private static int lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return 0;
        if(root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if(root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        return root.val;
    }
}
