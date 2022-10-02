class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
Queue<int[]> queue=new LinkedList<>();
    if(grid[0][0]==1){
return -1;
    }
    int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};

    queue.offer(new int[]{0,0,1});
       // int dist[][]={{}}
        while(!queue.isEmpty()){
            int[]temp=queue.poll();
            int m=temp[0];
            int n=temp[1];
            int v=temp[2];
            if(m==grid.length-1&& n==grid[0].length-1){
                return v;
            }
            for(int [] d: dir){
                int newr=d[0]+temp[0];
                                int newc=d[1]+temp[1];
                if(newr>=0&& newr<grid.length&& newc>=0&& newc<grid[0].length&& grid[newr][newc]==0){
                    grid[newr][newc]=1;
                          queue.offer(new int[]{newr,newc,temp[2]+1});
                    
                }

            }
        }
        return -1;
    }
}