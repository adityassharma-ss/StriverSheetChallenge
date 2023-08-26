package Trees;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(root.val);
    }

    private static TreeNode sortedArrayToBST(int[] nums){
        if(nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int start, int end){
        if(start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid+1, end);
        return root;
    }
}
