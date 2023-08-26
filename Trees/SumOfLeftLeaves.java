import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        root.left = left;
        TreeNode right = new TreeNode(20);
        root.right = right;
        TreeNode left1 = new TreeNode(15);
        right.left = left1;
        TreeNode right1 = new TreeNode(7);
        right.right = right1;
        System.out.println(sumOfLeftLeaves(root));
        System.out.println(sumOfRightLeaves(root));
    }   

    private static int sumOfLeftLeaves(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null) sum += root.left.val;
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    private static int sumOfRightLeaves(TreeNode root){
        if(root == null) return 0;
        int sum = 0;
        if(root.right != null && root.right.left == null && root.right.right == null) sum += root.right.val;
        sum += sumOfRightLeaves(root.left);
        sum += sumOfRightLeaves(root.right);
        return sum;
    }
}
