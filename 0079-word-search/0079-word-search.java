class Solution {
    public boolean exist(char[][] board, String word) {
//boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
                    for(int j=0;j<board[i].length;j++){
                        if(board[i][j]==word.charAt(0)){
                           if(helper(board,i,j,word,0)==true){
                               return true;
                           }
                            
                        }

        
                    }
        }
        return false;
    }
    public boolean  helper(char[][]board,int i,int j,String word,int c){
        if(c==word.length()){
            return true;
        }
        if(i<0||j<0||i==board.length||j==board[i].length|| word.charAt(c)!=board[i][j]){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='.';
        boolean ans=helper(board,i+1,j,word,c+1)||helper(board,i-1,j,word,c+1)||helper(board,i,j-1,word,c+1)||helper(board,i,j+1,word,c+1);
board[i][j]=temp;
        return ans;


    }
    }
            