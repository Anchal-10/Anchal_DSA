class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1){
return -1;
        }
                if(grid[m-1][n-1]==1){
return -1;
        }

        
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{0,0,1});
        grid[0][0]=1;
int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
while(!queue.isEmpty()){
    int size=queue.size();
    for(int i=0;i<size;i++){
        int temp[]=queue.poll();
        if(temp[0]==m-1&& temp[1]==n-1){
            return temp[2];
        }
        for(int []d: dir){
            int row=temp[0]+d[0];
            int col=temp[1]+d[1];
            if(row>=0&& col>=0&& row<n&& col<n&& grid[row][col]==0){
                queue.offer(new int[]{row,col,temp[2]+1});
                            grid[row][col]=1;

            }
        }
    }
}
        return -1;
    }
}