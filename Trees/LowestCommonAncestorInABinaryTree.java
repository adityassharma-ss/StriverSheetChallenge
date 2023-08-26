import java.util.*;

public class LowestCommonAncestorInABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(5);
        root.left = left;
        TreeNode right = new TreeNode(1);
        root.right = right;
        TreeNode left1 = new TreeNode(6);
        left.left = left1;
        TreeNode right1 = new TreeNode(2);
        left.right = right1;
        TreeNode left2 = new TreeNode(0);
        right.left = left2;
        TreeNode right2 = new TreeNode(8);
        right.right = right2;
        TreeNode left3 = new TreeNode(7);
        right1.left = left3;
        TreeNode right3 = new TreeNode(4);
        right1.right = right3;
        System.out.println(lowestCommonAncestor(root, left, right).val);
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode left, TreeNode right){
        if(root == null || root == left || root == right){
            return root;
        }

        TreeNode p = lowestCommonAncestor(root.left, left, right);
        TreeNode q = lowestCommonAncestor(root.right, left, right);

        if(p == null){
            return q;
        }
        else if(q == null){
            return p;
        }
        else{
            return root;
        }
    }
}
