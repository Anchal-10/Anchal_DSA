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
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
                helper(root);
            return max;
    }
    public int helper(TreeNode root){
        if(root==null){
return 0;
        }
      int l=  helper(root.left);
      int r=  helper(root.right);
        int lef=0;
        int righ=0;
        if(root.left!=null&& root.val==root.left.val){
          lef=  1+l;
        }
                if(root.right!=null&& root.val==root.right.val){
          righ= 1+r;
        }
        max=Math.max(max,lef+righ);
        return Math.max(lef,righ);
    }
}


        
