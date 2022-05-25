class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
    Stack<int[]> stack=new Stack<>();
        stack.push(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int m=intervals[i][0];
            int n=intervals[i][1];
            int poparr[]=stack.pop();
            int c=poparr[0];
            int d=poparr[1];
            int endmax=Math.max(d,n);
            if(d>=m){
                int merge[]=new int[]{c,endmax};
                stack.push(merge);
            }
            else{
                stack.push(poparr);
                                stack.push(intervals[i]);

            }
        }
        
    
    int a[][]=new int[stack.size()][2];
    int i=stack.size()-1;
    while(!stack.isEmpty()){
int t[]=stack.pop();
     a[i]=t;
        i--;
    }
        return a;
    }
}