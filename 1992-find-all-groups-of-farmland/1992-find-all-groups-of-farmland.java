class Solution {
    public int[][] findFarmland(int[][] land) {
        int m=land.length;
        int n=land[0].length;
List<int[]> temp=new ArrayList<>();
        int max=0;
        boolean visited[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==1 && visited[i][j]==false){
                    int arr[]=new int[4];
                    arr[0]=i;
                    arr[1]=j;
                    helper(land,i,j,m,n,visited,arr);
                    temp.add(arr);
                }
            }
        }
        int res[][]=new int[temp.size()][4];
        for(int i=0;i<temp.size();i++){
for(int j=0;j<4;j++){
    res[i][j]=temp.get(i)[j];
}
        }
        return res;
    }
    
    public void helper(int [][]a,int i,int j,int m,int n,boolean[][]visited,int[]arr){
        if(i<0|| j<0|| i>=m|| j>=n || visited[i][j]==true|| a[i][j]==0){
            return;
        }
        arr[2]=Math.max(arr[2],i);
        arr[3]=Math.max(arr[3],j);

        visited[i][j]=true;
        helper(a,i+1,j,m,n,visited,arr);
        helper(a,i,j+1,m,n,visited,arr);
        
    }
}





