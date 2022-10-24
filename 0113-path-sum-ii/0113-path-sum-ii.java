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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        helper(res,new ArrayList<>(),root,targetSum);
        return res;
    }
    public void helper(List<List<Integer>> res,List<Integer> temp,TreeNode root,int sum){
        if(root==null){
            return;
        }
        temp.add(root.val);
        if(root.left==null&& root.right==null){
               if(sum-root.val==0){
                    res.add(new ArrayList<>(temp));
                }
            
            
}
        helper(res,temp,root.left,sum-root.val);
        helper(res,temp,root.right,sum-root.val);
        temp.remove(temp.size()-1);

}
}