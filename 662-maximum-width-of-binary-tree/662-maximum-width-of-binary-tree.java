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
class Pair{
    TreeNode node;
    int index;
    public Pair(TreeNode node,int index){
        this.node=node;
        this.index=index;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        int first=-1;
        int last=-1;
        int max=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
                        int size=queue.size();
            int min=queue.peek().index;            
            for(int i=1;i<=size;i++){
                TreeNode temp=queue.peek().node;
                int curr=queue.peek().index-min;
                queue.poll();
                
                if(i==1){
                    first=curr;
                }
                                if(i==size){
                    last=curr;
                }
if(temp.left!=null){
    queue.offer(new Pair(temp.left,(2*curr)+1));
}
                if(temp.right!=null){
    queue.offer(new Pair(temp.right,(2*curr)+2));
}

            }
                            max=Math.max(max,last-first+1);

        }
        return max;
    }
}
