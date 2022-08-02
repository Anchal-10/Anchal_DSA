class Solution {
    
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length;
        int n=matrix[0].length;
int low=matrix[0][0];
        int high=matrix[m-1][n-1];
        while(low<=high){
            int mid=(low+(high-low)/2);
            int ans=0;
            for(int i=0;i<m;i++){
                int start=0;
                int end=n-1;
                while(start<=end){
                    int M=start+(end-start)/2;
                    if(matrix[i][M]<=mid){
                        start=M+1;
                        
                    }
                    else{
                        end=M-1;
                    }
                }
            ans+=start;
            }
            if(ans<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}