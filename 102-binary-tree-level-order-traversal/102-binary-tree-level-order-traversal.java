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
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> arr=new ArrayList<>();
          int m=queue.size();
            for(int i=1;i<=m;i++){
                TreeNode temp=queue.poll();
                arr.add(temp.val);
                if(temp.left!=null){
queue.add(temp.left);
                }
                                if(temp.right!=null){
queue.add(temp.right);
                }

            }
            al.add(arr);
        }
        return al;
    }
}