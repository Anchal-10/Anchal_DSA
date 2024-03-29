class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=(m*n)-1;
        while(i<=j){
            int mid=(i+j)>>1;
            if(matrix[mid/n][mid%n]==target){
                return true;
            }
                  else if(matrix[mid/n][mid%n]<target){
                      i=mid+1;

        }
            else{
                j=mid-1;
            }
        }
        return false;
        }
}
