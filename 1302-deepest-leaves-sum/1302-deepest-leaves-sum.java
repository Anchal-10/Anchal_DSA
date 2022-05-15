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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int sum=0;
        while(!queue.isEmpty()){
         int s=queue.size();
             sum=0;
            for(int i=1;i<=s;i++){
                            TreeNode temp=queue.poll();

                sum=sum+temp.val;
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
queue.offer(temp.right);
                }
            }
        }
        return sum;
    }
}