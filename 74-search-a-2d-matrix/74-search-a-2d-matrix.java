class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i= 0;
        int j=matrix[0].length-1;
        while(i<matrix.length&& j>=0){
            if(matrix[i][j]==target){
return true;
            }
            else if(matrix[i][j]>target){
                j--;
            }
            else if(matrix[i][j]<target){
i++;
            }
        }
        return false;
        
    }
}
   /**     int i = 0; 
        int j = matrix[0].length - 1;
        
        while (j >= 0 && i < matrix.length) {
            if (matrix[i][j] < target) {
                i++;
            }
            else if (matrix[i][j] > target) {
                j--;
            }
            //Found the element, return true.
            else {
                return true;
            }
        }
        
        //Element not found, return false.
        return false;
    }
}**/
