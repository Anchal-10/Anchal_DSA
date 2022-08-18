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
    int count=0;
    public int goodNodes(TreeNode root) {
        helper(root,Integer.MIN_VALUE);
        return count;
    }
    public void helper(TreeNode root,int num){
        if(root==null){
return;
        }
        if(root.val>=num){
    count++;
        }
       helper(root.left,Math.max(root.val,num));
           helper(root.right,Math.max(root.val,num));


        }

}