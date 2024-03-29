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
    TreeNode res=null;
    int max=0;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        helper(root,0);
        return res;
    }
    public int helper(TreeNode root,int level){
        if(root==null){
return level;
        }
int l=helper(root.left,level+1);
    int r=helper(root.right,level+1);
        if(l==r&& l>=max){
            max=l;
            res=root;
        }
        return Math.max(l,r);

    }
}