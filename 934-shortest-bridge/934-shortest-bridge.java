class Solution {
              Queue<int[]> queue=new LinkedList<>();

    public int shortestBridge(int[][] grid) {
        int n=grid.length;
        boolean found=false;
          Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    found=true;
                  dfs(grid,i,j,n);
                    break;
                }
            }
            if(found==true){
                break;
            }
        }
        return bfs(grid,n);
    }
        public void dfs(int[][]a,int i,int j,int n){
           if(i<0|| j<0||i>=n|| j>=n|| a[i][j]==0|| a[i][j]==2){
               return;
               
           }
            a[i][j]=2;
            queue.add(new int[]{i,j});
            dfs(a,i+1,j,n);
            dfs(a,i-1,j,n);
            dfs(a,i,j+1,n);
            dfs(a,i,j-1,n);


        }
    public int bfs(int[][]a,int n){
        int dis=0;
            int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int m[]=queue.poll();
                for(int dir[]: dirs){
                    int newr=m[0]+dir[0];
                                        int newc=m[1]+dir[1];
                    if(newr<0|| newc<0|| newr>=n|| newc>=n){
                        continue;
                    }
                    else if(a[newr][newc]==0){
                        queue.add(new int[]{newr,newc});
                        a[newr][newc]=2;
                    }
                    else if(a[newr][newc]==1){
                        return dis;
                        
                    }
                }
            }
        dis++;
        }
        return -1;
    }
}
