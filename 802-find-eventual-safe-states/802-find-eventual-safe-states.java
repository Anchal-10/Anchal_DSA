class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
      List<List<Integer>> adjgraph=new ArrayList<>();
          for(int i=0;i<graph.length;i++){
               adjgraph.add(new ArrayList<>());
          } 
        for(int i=0;i<graph.length;i++){
            for(int j=0;j<graph[i].length;j++){
            adjgraph.get(i).add(graph[i][j]);
        }
        }
        boolean[] visited=new boolean[graph.length];
        boolean[] pathvisited=new boolean[graph.length];
        boolean check[] =new boolean[graph.length];
        
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
            helper(i,visited,pathvisited,adjgraph,check);
        }
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<visited.length;i++){
            if(check[i]==true){
                res.add(i);
            }
        }
        return res;
    }
public boolean helper(int n,boolean[]visited,boolean[]pathvisited,List<List<Integer>> graph,boolean[]check){
    
    visited[n]=true;
    pathvisited[n]=true;
    for(int i: graph.get(n)){
        if(!visited[i]){
            if(helper(i,visited,pathvisited,graph,check)){
                return true;
            }
        }
        else if(pathvisited[i]){
return true;
        }
    }
    pathvisited[n]=false;
    check[n]=true;
    return false;
}
}