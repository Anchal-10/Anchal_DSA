class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
Queue<int[]> queue=new LinkedList<>();
queue.add(new int[]{entrance[0],entrance[1],0});
    maze[entrance[0]][entrance[1]]='+';

        boolean first=true;
        int dir[][]={{0,1},{1,0},{0,-1},{-1,0}};
int m=maze.length;
        int n=maze[0].length;
while(!queue.isEmpty()){
    int size=queue.size();
    for(int i=0;i<size;i++){
        int[]temp=queue.poll();
        if(!first&&(temp[0]==0|| temp[1]==n-1|| temp[0]==m-1|| temp[1]==0 )){
            return temp[2];
        }
        first=false;
        for(int [] a: dir){
            int newr=temp[0]+a[0];
                int newc=temp[1]+a[1];
            if(newr>=0&& newc>=0&&newr<m&&newc<n&& maze[newr][newc]=='.'){
                queue.offer(new int[]{newr,newc,temp[2]+1});
                maze[newr][newc]='+';
            }
        }
    }
}
        return -1;
        
    }
}