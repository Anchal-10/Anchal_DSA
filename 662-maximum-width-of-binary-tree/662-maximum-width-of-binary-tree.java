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
class pair{
TreeNode node;
    int index;
    public pair(TreeNode node,int index){
    this.node=node;
    this.index=index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> queue=new LinkedList<>();
        int ans=0;
        queue.offer(new pair(root,0));
        while(!queue.isEmpty()){
            int size=queue.size();
            int min=queue.peek().index;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
TreeNode temp=queue.peek().node;
                int curr=queue.peek().index-min;
                queue.poll();
                if(i==0){
first=curr;
                }
                                if(i==size-1){
                                    
last=curr;
                }
            if(temp.left!=null){
                queue.offer(new pair(temp.left,2*curr+1));
            }

                            if(temp.right!=null){
                queue.offer(new pair(temp.right,2*curr+2));
            }
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}
