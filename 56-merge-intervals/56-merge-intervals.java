class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        Stack<int[]> stack=new Stack<>();
        stack.push(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            int []poparr=stack.pop();
            int start1= poparr[0];
            int end1= poparr[1];
            if(end1>=start2){
              int  endmax=Math.max(end1,end2);
                int temp[]=new int[]{start1,endmax};
                stack.push(temp);
                
            }
            else{
                
                stack.push(poparr);
                stack.push(intervals[i]);
            }
        }
        int res[][]=new int[stack.size()][2];
        int j=0;
        while(!stack.isEmpty()){
res[j++]=stack.pop();
        }

     return res;       
}
    }
