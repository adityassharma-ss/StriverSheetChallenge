import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class RangeSumOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        root.left = left;
        TreeNode right = new TreeNode(15);
        root.right = right;
        TreeNode left1 = new TreeNode(3);
        left.left = left1;
        TreeNode right1 = new TreeNode(7);
        left.right = right1;
        TreeNode right2 = new TreeNode(18);
        right.right = right2;
        System.out.println(rangeSumBST(root, 7, 15));
    }

    private static int rangeSumBST(TreeNode root, int low, int high){
        if(root == null) return 0;
        int sum = 0;
        if(root.val >= low && root.val <= high) sum += root.val;
        if(root.val > low) sum += rangeSumBST(root.left, low, high);
        if(root.val < high) sum += rangeSumBST(root.right, low, high);
        return sum;
    }
}
