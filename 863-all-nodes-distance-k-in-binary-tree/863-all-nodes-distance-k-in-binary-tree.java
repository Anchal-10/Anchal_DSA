/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> al=new ArrayList<>();
HashMap<TreeNode,TreeNode > map=new HashMap<>();
        helper(root,map);
        Queue<TreeNode> queue=new LinkedList<>();
        HashMap<TreeNode,Boolean> kmap=new HashMap<>();
        queue.offer(target);
        kmap.put(target,true);
        int c=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            if(c==k){
break;
            }
            c++;
            for(int i=1;i<=size;i++){
            TreeNode temp=queue.poll();
            if(temp.left!=null&& kmap.get(temp.left)==null){
queue.offer(temp.left);
            kmap.put(temp.left,true);
            }
                            if(temp.right!=null&& kmap.get(temp.right)==null){
queue.offer(temp.right);
            kmap.put(temp.right,true);
            }
            if(map.get(temp)!=null&& kmap.get(map.get(temp))==null){
queue.offer(map.get(temp));
            kmap.put(map.get(temp),true);
            }

            }
        }
        while(!queue.isEmpty()){
            al.add(queue.poll().val);
        }
        return al;
    }
public void helper(TreeNode root,HashMap<TreeNode,TreeNode> map){
    if(root==null){
return;
    }
    Queue<TreeNode> queue=new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){
        int size=queue.size();
        for(int i=1;i<=size;i++){
            TreeNode temp=queue.poll();
            if(temp.left!=null){
                queue.offer(temp.left);
                map.put(temp.left,temp);
}
                        if(temp.right!=null){
                queue.offer(temp.right);
                map.put(temp.right,temp);
}
        }
    }
}
}


    
    
    
    
    
    
    
    
    
    
    
    
