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
HashMap<Integer,Integer>map;
    int count=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        map=new HashMap<>();
    helper(root);
        return count;
        
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
    if(root.left==null&& root.right==null){
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        int even=0;
        int odd=0;
        for(int k: map.keySet()){
            if(map.get(k)%2==0){
                even++;
            }
                else{
                odd++;
            }
        }
if(odd<=1){
    count++;
}
        
                    map.put(root.val,map.getOrDefault(root.val,0)-1);

            
            
        
    return;
    }
        
        
         map.put(root.val,map.getOrDefault(root.val,0)+1);
       
helper(root.left);
        helper(root.right);
                map.put(root.val,map.getOrDefault(root.val,0)-1);

        
    }
    }