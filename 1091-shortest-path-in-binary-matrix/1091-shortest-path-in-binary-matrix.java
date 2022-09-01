class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if(grid[0][0]==1|| grid[m-1][n-1]==1){
return -1;
        }
        Queue<int[]> queue=new LinkedList<>();
        
queue.offer(new int[]{0,0,1});
        //break;
    
    int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};

    int ans=-1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int []temp=queue.poll();
                if(temp[0]==m-1&& temp[1]==n-1){
ans= temp[2];
                    break;
                }
                for(int []d: dir){
                    int nr=d[0]+ temp[0];
                                        int nc=d[1]+ temp[1];
                    if(nr>=0&&nr<m&& nc>=0&& nc<n&& grid[nr][nc]==0){
                        queue.offer(new int[]{nr,nc,temp[2]+1});
                                            grid[nr][nc]=1;

                    }

                }
                
            }
                
            }
        return ans;
        }
    }