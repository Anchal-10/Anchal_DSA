class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            al.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1&& i!=j){
                    al.get(i).add(j);
                                       // al.get(j).add(i);

                }
                    
            }
        }
       boolean[]visited=new boolean[isConnected.length];
        int c=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                c++;
                dfs(al,visited,i);
            }
        }
        return c;
    }
public void dfs(        List<List<Integer>> al,boolean[]visited,int i){
visited[i]=true;
    for(int ele: al.get(i)){
        if(!visited[ele]){
        dfs(al,visited,ele);
    }
}
}
}
