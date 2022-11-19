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
            List<Integer> al=new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
if(root==null){
return null;
}
        if(root.left==null&& root.right==null){
            return root;
        }
        helper(al,root);
        TreeNode res=createBST(0,al.size()-1);
        return res;
        
    }
    public void helper(List<Integer> al,TreeNode root){
if(root==null){
return;
}
        helper(al,root.left);
        al.add(root.val);
        helper(al,root.right);
    }
    public TreeNode createBST(int low,int high){
        if(low>high){
return null;
        }
        int mid=low+(high-low)/2;
        TreeNode root=new TreeNode(al.get(mid));
        root.left=createBST(low,mid-1);
                root.right=createBST(mid+1,high);
        return root;
    }
}