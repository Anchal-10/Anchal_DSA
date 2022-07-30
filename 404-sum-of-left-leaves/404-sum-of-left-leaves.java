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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sumOfLeft(root);
        return sum;
    }
    public void sumOfLeft(TreeNode root){
        if(root==null){
return ;
        }
        if(isLeaf(root.left)){
            sum+=root.left.val;
        }
         sumOfLeft(root.left);
         sumOfLeft(root.right);
        
    }
    public boolean isLeaf(TreeNode root){
        if(root==null){
            return false;
        }
        if(root.left==null&& root.right==null){
            return true;
        }
else{
    return false;
}
    }
}