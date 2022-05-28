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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
return true;
        }
        
        int m=height(root.left);
        int n=height(root.right);
        if(Math.abs(m-n)>1){
            return false;
        }
        boolean a=isBalanced(root.left);
                boolean b=isBalanced(root.right);
        if(!a||!b){
return false;
        }
return true;
    }
    public int height(TreeNode root){
        if(root==null){
return 0;
        }
        int left=height(root.left);
                int right=height(root.right);
        return Math.max(left,right)+1;

        
    }
}