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
    public int findBottomLeftValue(TreeNode root) {
        int res=0;
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
    queue.offer(root);
        while(!queue.isEmpty()){
            int s=queue.size();
            for(int i=0;i<s;i++){
                if(i==0){
                    res=queue.peek().val;
                }
                TreeNode temp=queue.poll();
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                                if(temp.right!=null){
                    queue.offer(temp.right);
                }

            }
        }
        return res;
    }
}