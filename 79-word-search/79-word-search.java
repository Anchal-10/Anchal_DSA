class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        boolean [][]visited=new boolean[m][n];
        boolean ans=false;
        for(int i=0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(word.charAt(0)==board[i][j]&& visited[i][j]==false){
                            boolean flag=helper(board,i,j,word,visited,0);
                            if(flag){
                                ans=true;
                                break;
                            }
                        }

            
        }
    }
        return ans;
}
        public boolean helper(char[][] board, int i,int j,String word,boolean[][]visited,int c) {
                        if(c==word.length()){
                return true;
            }

                        if(i<0|| j<0|| i>=board.length||c>=word.length()|| j>=board[0].length|| visited[i][j]==true|| board[i][j]!=word.charAt(c)){
return false;
                        }

            visited[i][j]=true;
        boolean m=  helper(board,i-1,j,word,visited,c+1)||helper(board,i,j+1,word,visited,c+1)||helper(board,i,j-1,word,visited,c+1)||helper(board,i+1,j,word,visited,c+1);
            visited[i][j]=false;
            return m;
        }
}

            


