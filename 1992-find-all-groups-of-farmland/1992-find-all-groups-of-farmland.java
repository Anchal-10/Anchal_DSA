class Solution {
            int max=-1;
        int max2=-1;

    public int[][] findFarmland(int[][] land) {
int m=land.length;
        int n=land[0].length;
        List<int[]> temp=new ArrayList<>();
//    List<Integer> al;
        for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
    if(land[i][j]==1){
        int arr[]=new int[4];
        arr[0]=i;
        arr[1]=j;
        helper(land,i,j,m,n,arr);
        temp.add(arr);
    }
}
        }
        int res[][]=new int[temp.size()][4];
        for(int i=0;i<res.length;i++){
            res[i][0]=temp.get(i)[0];
                        res[i][1]=temp.get(i)[1];
            res[i][2]=temp.get(i)[2];
            
            res[i][3]=temp.get(i)[3];

        }
        return res;
        
        
}
public void helper(int [][]a,int i,int j,int m,int n,int arr[]){
    if(i<0||j<0|| i>=m|| j>=n|| a[i][j]==0){
        return;
    }
    arr[2]=Math.max(arr[2],i);
        arr[3]=Math.max(arr[3],j);
    a[i][j]=0;
    helper(a,i+1,j,m,n,arr);
    helper(a,i,j+1,m,n,arr);
}
}

