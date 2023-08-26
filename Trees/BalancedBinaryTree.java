package Trees;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        root.left = left;
        TreeNode right = new TreeNode(2);
        root.right = right;
        TreeNode left1 = new TreeNode(5);
        left.left = left1;
        System.out.println(isBalanced(root));
    }

    private static boolean isBalanced(TreeNode root){
        if(root == null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(height(root.left) - height(root.right)) <= 1;
    }

    private static int height(TreeNode root){
        if(root == null) return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
