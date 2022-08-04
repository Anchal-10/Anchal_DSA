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
    HashMap<Integer,Integer> map=new HashMap<>();
    int maxCount=0;
    public int[] findFrequentTreeSum(TreeNode root) {
        postOrder(root);
        ArrayList<Integer> al=new ArrayList<>();
        for(int i: map.keySet()){
if(map.get(i)==maxCount){
    al.add(i);
    
}}
        int res[]=new int[al.size()];
        for(int i=0;i<al.size();i++){
res[i]=al.get(i);
        }
        return res;
    }
    
    public int postOrder(TreeNode root){
        if(root==null){
return 0;
        }
        int left=postOrder(root.left);
        int right=postOrder(root.right);
        int sum=left+right+root.val;
        map.put(sum,map.getOrDefault(sum,0)+1);
        maxCount=Math.max(map.get(sum),maxCount);
         
return sum;
    }
    }