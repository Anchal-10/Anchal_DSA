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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=buildfun(0,preorder,preorder.length-1,0,inorder,inorder.length-1,map);
        return root;
    }
    public TreeNode buildfun(int prestart,int[]preorder,int preend,int instart,int[]inorder,int inEnd,HashMap<Integer,Integer> map){
        if(prestart>preend|| instart>inEnd){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prestart]);
        int inRoot=map.get(root.val);
        int numsleft=inRoot-instart;
        root.left=buildfun(prestart+1,preorder,prestart+numsleft,instart,inorder,inRoot-1,map);
                    root.right=buildfun(prestart+numsleft+1,preorder,preend,inRoot+1,inorder,inEnd,map);

        return root;
        
    }
}