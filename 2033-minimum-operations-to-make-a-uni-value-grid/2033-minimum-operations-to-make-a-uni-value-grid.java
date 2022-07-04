class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
int[] res=new int[m*n];
        int k=0;
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              res[k++]=grid[i][j];
          }
}
        
        Arrays.sort(res);
        int med=res[res.length/2];
        int steps=0;
        for(int i=0;i<res.length;i++){
            if(Math.abs(res[i]-med)%x!=0){
return -1;
            }
            else{
steps+=Math.abs(res[i]-med)/x;

                
            }
        }
        return steps;
    }
}