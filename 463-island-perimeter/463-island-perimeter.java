class Solution {
    int count=0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0;i<grid.length;i++){
for(int j=0;j<grid[0].length;j++){
    if(grid[i][j]==1){
        helper(grid,i,j);
        break;
    }
}}
        return count;
        
    }



public void helper(int [][] a,int i,int j){


if(i<0 || i>=a.length || j<0 || j>=a[0].length|| a[i][j]==0){
    count++;
    return;
}
    if(a[i][j]==-1){
return;
    }
    a[i][j]=-1;
    helper(a,i+1,j);
    helper(a,i-1,j);
    helper(a,i,j+1);
    helper(a,i,j-1);





}
}