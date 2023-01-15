class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
             graph.get(edges[i][0]).add(edges[i][1]);
                         graph.get(edges[i][1]).add(edges[i][0]);

            
        }
    boolean visited[]=new boolean[n+1];
        return helper(graph,visited,0,hasApple);
    }
    int helper(List<List<Integer>>graph,boolean[]visited,int i,List<Boolean> hasApple){
        int ans=0;
        visited[i]=true;
        for(int a: graph.get(i)){
            if(!visited[a]){
                ans+=helper(graph,visited,a,hasApple);
            }
        }
        if(i==0){
return ans;
        }
        
            if(hasApple.get(i)==true|| ans!=0){
                return ans+2;
            }
        return ans;
        }
    }