package Trees;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        root.left = left;
        TreeNode right = new TreeNode(2);
        root.right = right;
        TreeNode left1 = new TreeNode(5);
        left.left = left1;
        TreeNode root1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(1);
        root1.left = left2;
        TreeNode right1 = new TreeNode(3);
        root1.right = right1;
        TreeNode right2 = new TreeNode(4);
        left2.right = right2;
        TreeNode right3 = new TreeNode(7);
        right1.right = right3;
        TreeNode root2 = mergeTrees(root, root1);
        System.out.println(root2.val);
    }

    private static TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 == null) return root2;
        if(root2 == null) return root1;
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;

    }
}
