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
 * }*/
class pair{
int num;
TreeNode node;
pair(TreeNode Node,int number){
    num=number;
    node=Node;
}
}

class Solution {                                     
public int widthOfBinaryTree(TreeNode root) { 
    if(root==null)return 0;
    int ans=0;
    Queue<pair>q=new LinkedList();
    q.add(new pair(root,0));
    while(!q.isEmpty()){
        int mmin=q.peek().num;
        int first=0;
        int last=0;
        int n=q.size();
        for(int i=0;i<n;i++){
            int current_index=q.peek().num-mmin;
            TreeNode temp=q.peek().node;
            q.poll();
            if(i==0)first=current_index;
            if(i==n-1)last=current_index;
            if(temp.left!=null){
                q.add(new pair(temp.left,current_index*2+1));
            }
            if(temp.right!=null){
                q.add(new pair(temp.right,current_index*2+2));
            }
            
        }
        ans=Math.max(ans,last-first+1);
    }
    return ans;
}
}
