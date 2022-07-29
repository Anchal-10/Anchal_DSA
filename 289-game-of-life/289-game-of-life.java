class Solution {
    int [][]dir={{0,1},{1,0},{0,-1},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
                    for(int j=0;j<board[i].length;j++){
                        if(board[i][j]==1){
                                                        int m=helper(board,i,j);
if(m>3|| m<2){
    board[i][j]=-2;
}
                        }
                        else if(board[i][j]==0){
                            int m=helper(board,i,j);
                            if(m==3){
                                board[i][j]=-1;
                            }
                        }

        }
    }
        update(board);
    }

        public int helper(int matrix[][],int i,int j){
            int count=0;
            for(int r[]: dir){
                int nrow=i+r[0];
                int ncol=j+r[1];
                if(ncol<matrix[0].length&&nrow >=0&& ncol>=0&& nrow<matrix.length&& (matrix[nrow][ncol]==1|| matrix[nrow][ncol]==-2) ){
                    count++;
                }
            }
            return count;
        }
    public void update(int[][]board){
        for(int i=0;i<board.length;i++){
                    for(int j=0;j<board[i].length;j++){
                        if(board[i][j]==-2){
                            board[i][j]=0;
                        }
                        if(board[i][j]==-1){
                            board[i][j]=1;
                        }
                    }
        }}
}

