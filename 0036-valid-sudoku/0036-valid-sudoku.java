class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set= new HashSet<>();
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    if(set.contains(board[i][j]+"R"+i)|| set.contains(board[i][j]+"C"+j)||set.contains(board[i][j]+"B"+i/3+"_"+j/3)){
                        return false;
                    }
                       else{
                           set.add(board[i][j]+"R"+i);
                                                      set.add(board[i][j]+"C"+j);
                           set.add(board[i][j]+"B"+i/3+"_"+j/3);

                           
                           
                       }
                }
            }
        }
                       return true;
    }
}