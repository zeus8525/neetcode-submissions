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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        int cnt = 0;
        while(true){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode pop = stack.pop();
            cnt ++;
            if (cnt == k) return pop.val;
            cur = pop.right; 
        }
    }
}
