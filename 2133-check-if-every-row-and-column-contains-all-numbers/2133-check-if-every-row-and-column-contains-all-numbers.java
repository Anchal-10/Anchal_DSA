class Solution {
    public boolean checkValid(int[][] matrix) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
                   for(int j=0;j<matrix.length;j++){
                       if(set.contains(matrix[i][j]+"R"+i)||set.contains(matrix[i][j]+"C"+j)){
                           return false;
                       }
else{
    set.add(matrix[i][j]+"R"+i);
        set.add(matrix[i][j]+"C"+j);

    
}
                   }
        }
        return true;}
}
