class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
int []zeroR=new int[m];
        int []oneR=new int[m];
int []zeroC=new int[n];
        int []oneC=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
if(grid[i][j]==1){
    oneR[i]+=1;
        oneC[j]+=1;
}
else{
    zeroR[i]+=1;
        zeroC[j]+=1;
}

    
}
    
}
int ans[][]=new int[m][n];
        
                for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
ans[i][j]= oneR[i] + oneC[j] - zeroR[i] - zeroC[j];
            }
                }
    return ans;
    }
}
