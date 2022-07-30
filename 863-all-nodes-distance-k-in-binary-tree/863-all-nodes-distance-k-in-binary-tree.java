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
        List<Integer> res=new ArrayList<>();
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        mappingParent(root,map);
        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(target);
        visited.put(target,true);
        int distance=0;
        while(!queue.isEmpty()){
            if(distance==k){
                break;
            }
                        distance++;

            int size=queue.size();
            for(int i=1;i<=size;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null&& visited.get(temp.left)==null){
                    queue.offer(temp.left);
                    visited.put(temp.left,true);
                }
                                if(temp.right!=null&& visited.get(temp.right)==null){
                    queue.offer(temp.right);
                                                        visited.put(temp.right,true);

                }
                if(map.get(temp)!=null&& visited.get(map.get(temp))==null){
                    queue.offer(map.get(temp));
                                        visited.put(map.get(temp),true);

                }

            }
        }
        while(!queue.isEmpty()){
            res.add(queue.poll().val);
        }
    return res;
    }
    public void mappingParent(TreeNode root,HashMap<TreeNode,TreeNode> map){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            if(temp.left!=null){
                queue.add(temp.left);
                map.put(temp.left,temp);
            }
                        if(temp.right!=null){
                queue.add(temp.right);
                                            map.put(temp.right,temp);

            }
        }
        System.out.print(map);
    }
}


