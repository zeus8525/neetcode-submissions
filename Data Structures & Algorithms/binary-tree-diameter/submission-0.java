/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
        if(root == null) return -1;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int sum = left+1+right+1;
        int ret = Math.max(left+1,right+1);
        res = Math.max(sum,Math.max(ret,res));
        return ret;
    }
}
