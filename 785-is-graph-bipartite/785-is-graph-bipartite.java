class Solution {
    public boolean isBipartite(int[][] graph) {
  int n=graph.length;
        int color[]=new int[n];
        for(int i=0;i<graph.length;i++){
                    Queue<Integer> queue=new LinkedList<>();

            if(color[i]==0){
                color[i]=1;
                queue.offer(i);
                while(!queue.isEmpty()){
                    int m=queue.poll();
                    for(int curr:graph[m]){
                        if(color[curr]==0){
                            color[curr]=-color[m];
                            queue.offer(curr);
                        }
                        else if(color[curr]==color[m]){
return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}