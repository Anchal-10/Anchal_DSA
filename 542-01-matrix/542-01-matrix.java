
class Solution {
    int dir[][]={{1,0},{0,1},{-1,0},{0,-1}};
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
                    Queue<int[]> queue=new LinkedList<>();
boolean[][]vis=new boolean[m][n];
        int res[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
res[i][j]=0;

            queue.offer(new int[]{i,j,0});
                    vis[i][j]=true;
                }
            }
        }
                
            while(!queue.isEmpty()){
                int s=queue.size();
                for(int e=0;e<s;e++){
                    int r=queue.peek()[0];
                                        int c=queue.peek()[1];
                    res[r][c]=queue.peek()[2];

                    int temp[]=queue.poll();
                    
                    for(int d []: dir){
                        int newRow=d[0]+ temp[0];
                        int newCol=d[1]+ temp[1];
                        if(newRow<0|| newRow>=m|| newCol<0||newCol>=n || vis[newRow][newCol]==true){
continue;
                        }
                        vis[newRow][newCol]=true;
                                        queue.offer(new int[]{newRow,newCol,temp[2]+1});
                    }
                }
            }
        return res;
    }

        }
