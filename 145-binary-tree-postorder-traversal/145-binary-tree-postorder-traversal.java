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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        if(root==null){
return al;
        }
        Stack<TreeNode> stack=new Stack<>();
                Stack<TreeNode> stack1=new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
TreeNode temp=stack.pop();
            stack1.push(temp);
            if(temp.left!=null){
stack.push(temp.left);
            }
                        if(temp.right!=null){
stack.push(temp.right);
            }
        }
        while(!stack1.isEmpty()){
            al.add(stack1.pop().val);
        }
        return al;
    }
}