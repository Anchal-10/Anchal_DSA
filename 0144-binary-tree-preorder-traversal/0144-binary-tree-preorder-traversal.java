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
    public List<Integer> preorderTraversal(TreeNode root) {
List<Integer> al=new ArrayList<>();
        if(root==null){
            return al;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
TreeNode m=stack.pop();
        al.add(m.val);
if(m.right!=null){
    stack.push(m.right);
}
            if(m.left!=null){
    stack.push(m.left);
}
        }
        return al;
    }
}
