import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class ValidateBST {
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
        System.out.println(isValidBST(root));
    }

    public static boolean isValidBST(TreeNode root){
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}