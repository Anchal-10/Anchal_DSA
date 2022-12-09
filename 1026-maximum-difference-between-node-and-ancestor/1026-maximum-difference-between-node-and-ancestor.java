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
    int res=Integer.MIN_VALUE;
    public int maxAncestorDiff(TreeNode root) {
        helper(root);
        return res;
        
    }
    public int[]helper(TreeNode root){
        if(root==null){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE};
        }
        int left[]=helper(root.left);
        int right[]=helper(root.right);
        int leftmin=left[0];
        int rightmin=right[0];
        int min=Math.min(root.val,Math.min(leftmin,rightmin));
                int leftmax=left[1];
        int rightmax=right[1];
        int max=Math.max(root.val,Math.max(leftmax,rightmax));
        res=Math.max((root.val-min),Math.max((max-root.val),res));
        return new int[]{min,max};
        

        
    }
}