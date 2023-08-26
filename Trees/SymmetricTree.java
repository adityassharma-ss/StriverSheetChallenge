package Trees;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        root.left = left;
        TreeNode right = new TreeNode(2);
        root.right = right;
        TreeNode left1 = new TreeNode(3);
        left.left = left1;
        TreeNode right1 = new TreeNode(4);
        left.right = right1;
        TreeNode left2 = new TreeNode(4);
        right.left = left2;
        TreeNode right2 = new TreeNode(3);
        right.right = right2;
        System.out.println(isSymmetric(root));
    }

    private static boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
            if(left.val != right.val) return false;
            return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
