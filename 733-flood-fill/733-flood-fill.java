class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int target=image[sr][sc];
        if(target==color){
return image;
        }
                   backtrack(image,sr,sc,color,target);
 return image;
    }

        
        public void backtrack(int a[][],int row,int col,int color,int target){
            if(row<0||row>=a.length|| col<0|| col>=a[row].length||a[row][col]!=target){
return;
            }
            
            a[row][col]=color;
            
            backtrack(a,row-1,col,color,target);
            backtrack(a,row+1,col,color,target);
            backtrack(a,row,col-1,color,target);
            backtrack(a,row,col+1,color,target);

        }
    
}