class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        al.add(0);
helper(res,al,0,graph.length-1,graph);
        return res;
    }
public void helper(List<List<Integer>> res,List<Integer> temp,int source,int destination,int[][]graph){
    if(source==destination){
        res.add(new ArrayList<>(temp));
        return;
    }
    for(int node: graph[source]){
        temp.add(node);
        helper(res,temp,node,destination,graph);
        temp.remove(temp.size()-1);
    }
    
}
}
