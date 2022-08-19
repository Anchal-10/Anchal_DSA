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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null){
return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int max=Integer.MIN_VALUE;
            int s=queue.size();
            for(int i=0;i<s;i++){
                TreeNode m=queue.poll();
                max=Math.max(m.val,max);
                if(m.left!=null){
                    queue.offer(m.left);
                    
                }
                                if(m.right!=null){
                    queue.offer(m.right);
                    
                }

            }
            res.add(max);
            
}
        return res;
    }
}