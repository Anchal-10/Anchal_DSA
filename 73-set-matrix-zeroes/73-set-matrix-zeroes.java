class Solution {
    public void setZeroes(int[][] matrix) {
        int col=0;
        
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][0]==0)
            col=1;

        }
    
        for(int i=0;i<matrix.length;i++){
                    for(int j=1;j<matrix[i].length;j++){
                        if(matrix[i][j]==0){
                            matrix[i][0]=matrix[0][j]=0;
                        }
                    }
        }
        
        for(int i=matrix.length-1;i>=0;i--){
                    for(int j=matrix[0].length-1;j>=1;j--){
                        if(matrix[i][0]==0|| matrix[0][j]==0){
                            matrix[i][j]=0;
                        }
                    }
            if(col==1){
    matrix[i][0]=0;
}

            
        }
    }
}