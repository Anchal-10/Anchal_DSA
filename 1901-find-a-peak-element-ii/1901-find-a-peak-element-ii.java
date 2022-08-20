class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int lowRow=0;
        int highRow=mat.length-1;
        while(lowRow<=highRow){
            int midRow=(lowRow+highRow)>>1;
            int localmax=getLocalMax(mat[midRow],mat[midRow].length-1);
            if(midRow==0){
                if(mat[midRow][localmax]>mat[midRow+1][localmax]){
                    return new int[]{midRow,localmax};
                }
            }
                       if(midRow==mat.length-1){
                if(mat[midRow][localmax]>mat[midRow-1][localmax]){
                    return new int[]{midRow,localmax};
                }
                       }
                                if(mat[midRow+1][localmax]<mat[midRow][localmax]&&mat[midRow][localmax]>mat[midRow-1][localmax]){
                                                        return new int[]{midRow,localmax};                   
                                }
                                 if(mat[midRow][localmax]<mat[midRow+1][localmax]){
                    lowRow=midRow+1;
            }
                else{
                    highRow=midRow=1;
                }   
        }
        return new int[]{-1,-1};
}
    public int getLocalMax(int arr[],int end){
        int max=0;
        int maxi=0;
        for(int i=0;i<=end;i++){
            if(arr[i]>max){
max=arr[i];
                maxi=i;
            }
        }
        return maxi;
    }
}


    
    
    
    
    
    
    
    
    
    
    
    