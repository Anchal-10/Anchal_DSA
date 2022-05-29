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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        if(root==null){
return al;
        }
        
        helper(root,0,al);
        return al;
    }
    
    public void helper(TreeNode root,int level,        List<Integer> al)
{
        if(root==null){
return;
        }
        if(al.size()==level){
            al.add(root.val);
        }
        helper(root.right,level+1,al);
                helper(root.left,level+1,al);

    }
}