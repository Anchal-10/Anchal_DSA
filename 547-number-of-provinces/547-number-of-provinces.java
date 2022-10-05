class Solution {
    public int findCircleNum(int[][] isConnected) {
        int c=0;
List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(isConnected[i][j]==1&&i!=j){
                    graph.get(i).add(j);
                    
}
            }
        }
        boolean[]visited=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                c++;
                helper(graph,visited,i);
            }
        }
        return c;
    }
    public void helper(List<List<Integer>>graph,boolean[]visited,int n){
        visited[n]=true;
        for(int e: graph.get(n)){
if(visited[e]==false){
    helper(graph,visited,e);
}}
    }
}
