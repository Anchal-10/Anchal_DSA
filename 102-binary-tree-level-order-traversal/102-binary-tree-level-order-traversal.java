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
    public List<List<Integer>> levelOrder(TreeNode root) {
List<List<Integer>> al=new ArrayList<>();
        if(root==null){
return al;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> a=new ArrayList<>();
            int size=queue.size();
            for(int i=1;i<=size;i++){
                TreeNode temp=queue.poll();
                a.add(temp.val);
                if(temp.left!=null){
queue.offer(temp.left);
                }
                                if(temp.right!=null){
queue.offer(temp.right);
                }

            }
            al.add(a);
        }
        return al;
        }
}
