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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int cnt = 0;
        if(root == null) return cnt;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                TreeNode poll = q.poll();
                if(poll.left!=null)
                {
                    q.offer(poll.left);
                }
                if(poll.right!=null){
                    q.offer(poll.right);
                }
            }
            cnt++;
        }
        return cnt;
    }
}
