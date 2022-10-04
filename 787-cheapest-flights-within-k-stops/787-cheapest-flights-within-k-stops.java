class pair{
    int dest;
    int cost;
    public pair(int dest,int cost){
      this.dest=dest;
      this.cost=cost;
    }
}
class tuple{
    int stops;
    int node;
    int distance;
    public tuple(int stops,int node,int distance){
        this.stops=stops;
        this.node=node;
        this.distance=distance;
    }
}
 class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<pair>> graph=new ArrayList<>();
         for(int i=0;i<n;i++){
             graph.add(new ArrayList<pair>());
         }
        for(int i=0;i<flights.length;i++){
            graph.get(flights[i][0]).add(new pair(flights[i][1],flights[i][2]));
        }
PriorityQueue<tuple> pq=new PriorityQueue<>((a,b)-> a.stops-b.stops);
        pq.offer(new tuple(0,src,0));
        int distArray[]=new int[n];
        Arrays.fill(distArray,Integer.MAX_VALUE);
        distArray[src]=0;
        while(!pq.isEmpty()){
            tuple t=pq.poll();
            int stop=t.stops;
            int nodee=t.node;
            int dist=t.distance;
            if(stop>k){
                continue;
            }
            for(pair p: graph.get(nodee)){
                int adjnode=p.dest;
                int adjcost=p.cost;
                if(adjcost+ dist<distArray[adjnode]&& stop<=k){
                    distArray[adjnode]=adjcost+ dist;
                    pq.offer(new tuple(stop+1,adjnode,adjcost+ dist));
                    
                }
            }
        }
        if(distArray[dst]==Integer.MAX_VALUE){
            return -1;
        }
        return distArray[dst];
    }}
        
        
        
        
        
        
        
        
        
        
        
        