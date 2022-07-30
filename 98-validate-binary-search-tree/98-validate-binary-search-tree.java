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
    boolean flag=true;
    public boolean isValidBST(TreeNode root) {
        helper(root,Long.MAX_VALUE,Long.MIN_VALUE);
        return flag;
    }
    public void helper(TreeNode root,long max,long min){
if(root==null){
return ;
}
    if(root.val>=max|| root.val<=min){
        flag=false;
        
    }
            helper(root.left,root.val,min);
        helper(root.right,max,root.val);

    
}}
