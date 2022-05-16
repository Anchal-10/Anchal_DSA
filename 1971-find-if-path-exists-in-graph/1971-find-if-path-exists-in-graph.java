class edge{
    int src;
    int nei;
    public edge(int src,int nei){
        this.src=src;
        this.nei=nei;
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<edge> graph[]=new ArrayList[n];
        for(int i=0;i<n;i++ ){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
                        int v2=edges[i][1];
            graph[v1].add(new edge(v1,v2));
                        graph[v2].add(new edge(v2,v1));
        }
    boolean[]vis=new boolean[n];
        boolean m=helper(graph,source,destination,vis);
        return m;
    }
public boolean helper(ArrayList<edge>[]graph,int src,int des,boolean[]vis){
if(src==des){
return true;
}
    vis[src]=true;
    for(edge it:graph[src]){
        if(vis[it.nei]==false){
            boolean m=helper(graph,it.nei,des,vis);
            if(m==true){
return true;
            }
        }
    }
    return false;
}
}
    