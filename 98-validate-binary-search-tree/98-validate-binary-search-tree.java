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
    
    public boolean isValidBST(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        solve(root,al);
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>=al.get(i+1)){
return false;
            }
        }
        return true;
        
    }
    
public void solve(TreeNode root,List<Integer> al){
    if(root==null){
return;
    }
    
    solve(root.left,al);
    al.add(root.val);
    solve(root.right,al);
}
    }