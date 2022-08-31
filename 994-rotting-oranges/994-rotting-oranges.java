class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int countAll=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    countAll++;
                }
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j,0});
                }
}
        }
                int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        int countRotten=0;
        int c=0;
        int max=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            countRotten+=size;
            for(int i=0;i<size;i++){
                int[]temp=queue.poll();
                max=Math.max(max,temp[2]);
                for(int dir[]: dirs){
                    int newr=temp[0]+dir[0];
                                        int newc=temp[1]+dir[1];
if(newr>=0&& newr<grid.length&& newc>=0&& newc<grid[0].length&& grid[newr][newc]==1){
    queue.offer(new int[]{newr,newc,temp[2]+1});
    grid[newr][newc]=2;
}
                }
            }
            
        }
        return countRotten==countAll?max: -1;

                
            }
        }
        
