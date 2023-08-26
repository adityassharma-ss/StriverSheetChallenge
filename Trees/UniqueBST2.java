import java.util.ArrayList;
import java.util.List;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class UniqueBST2 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateTrees(n));
    }

    public static List<TreeNode> generateTrees(int n){
        if(n==0){
            return new ArrayList<>();
        }

        return recur(1,n);
    }

    private static List<TreeNode> recur(int s, int e){
        List<TreeNode> ans = new ArrayList<>();
        if(s>e){
            ans.add(null);
            return ans;
        }

        for(int i=s; i<=e; i++){
            List<TreeNode> left = recur(s,i-1);
            List<TreeNode> right = recur(i+1,e);

            for(TreeNode l:left){
                for(TreeNode r: right){
                    TreeNode res = new TreeNode(i,l,r);
                    ans.add(res);
                }
            }
        }
        return ans;
    }
}
