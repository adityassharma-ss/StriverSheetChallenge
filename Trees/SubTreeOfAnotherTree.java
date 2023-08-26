import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class SubTreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(4);
        root.left = left;
        TreeNode right = new TreeNode(5);
        root.right = right;
        TreeNode left1 = new TreeNode(1);
        left.left = left1;
        TreeNode right1 = new TreeNode(2);
        left.right = right1;
        TreeNode left2 = new TreeNode(0);
        right.left = left2;

        TreeNode subroot = new TreeNode(4);
        TreeNode left = new TreeNode(1);
        subroot.left = left;

        System.out.println(isSubtree(root, left));
    }

    private static boolean isSubtree(TreeNode root, TreeNode subroot){
        if(root == null) return false;
        if(isSameTree(root, subroot)) return true;
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }   

    private static boolean isSameTree(TreeNode root, TreeNode subroot){
        if(root == null && subroot == null) return true;
        if(root == null || subroot == null) return false;
            if(root.val != subroot.val) return false;
            return isSameTree(root.left, subroot.left) && isSameTree(root.right, subroot.right);
    }
}
