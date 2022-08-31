class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
int target=image[sr][sc];
        if(target==color){
            return image;
        }
        boolean visited[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,target,visited);
        return image;
    }
    
    public void helper(int[][]image,int sr,int sc,int color,int target,boolean visited[][]){
        if(sc<0|| sr<0|| sr>=image.length|| sc>=image[0].length|| image[sr][sc]!=target|| visited[sr][sc]==true){
            return;
            
        }
        image[sr][sc]=color;
        visited[sr][sc]=true;
        helper(image,sr+1,sc,color,target,visited);
        helper(image,sr-1,sc,color,target,visited);
        helper(image,sr,sc-1,color,target,visited);
        helper(image,sr,sc+1,color,target,visited);

        
    }
}