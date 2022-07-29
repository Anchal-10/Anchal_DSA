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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList<>();
        helper(res,root,"");
        return res;
    }
    public void helper(List<String> al,TreeNode root,String str){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            str+=root.val;
            al.add(str);
            return;
        }
        helper(al,root.left,str+ root.val+ "->");
                helper(al,root.right,str+ root.val+ "->");

    }
}