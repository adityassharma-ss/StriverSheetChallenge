package Trees;

public class MinimumAbsoluteDifferenceInBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        root.left = left;
        TreeNode right = new TreeNode(2);
        root.right = right;
        TreeNode left1 = new TreeNode(5);
        left.left = left1;
        System.out.println(getMinimumDifference(root));
    }

    public static int getMinimumDifference(TreeNode root) {
        int[] result = { Integer.MAX_VALUE };
        int[] prevValue = { -1 };
        function(root, prevValue, result);
        return result[0];
    }
    
    private static void function(TreeNode root, int[] prevValue, int[] minDiff) {
        if (root == null)
            return;
        
        function(root.left, prevValue, minDiff);
        
        if (prevValue[0] != -1) {
            minDiff[0] = Math.min(minDiff[0], root.val - prevValue[0]);
        }
        
        prevValue[0] = root.val;
        
        function(root.right, prevValue, minDiff);
    }


}
