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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
if(depth==1){
    TreeNode temp=new TreeNode (val);
    temp.left=root;
    return temp;
}
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int level=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=1;i<=size;i++){
                if(level!=depth-1){
                    TreeNode temp=queue.poll();

                                    if(temp.left!=null){
                        queue.offer(temp.left);
                    }
                                        if(temp.right!=null){
                        queue.offer(temp.right);
                    }
                }
                else{
                    TreeNode temp=queue.poll();
                    TreeNode curr=temp.left;
                    temp.left=new TreeNode(val);
                    temp.left.left=curr;
                
                                    TreeNode curr2=temp.right;
                    temp.right=new TreeNode(val);
                    temp.right.right=curr2;
            }
                if(level==depth){
                    break;
                }
            }
            level++;
        }
        return root;
    }
}

            

