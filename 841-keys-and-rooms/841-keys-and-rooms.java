class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    
        boolean[]visited=new boolean[rooms.size()];
dfs(rooms,0,visited);
    
    for(int i=0;i<visited.length;i++){
        if(!visited[i]){
return false;
        }
    }
return true;
    }

        public void dfs(List<List<Integer>> rooms,int n,boolean []visited){
        visited[n]=true;
        for(int ele: rooms.get(n)){
            if(!visited[ele]){
                       dfs(rooms,ele,visited);
 
            }
        }
        
        }
}
