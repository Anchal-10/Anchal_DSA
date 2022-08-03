class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
ArrayList<int[]> al=new ArrayList<>();
        int i=0;
        while(i<n&&intervals[i][1]<newInterval[0]){
            al.add(intervals[i]);
            i++;
        }
        int[]m=newInterval;
                while(i<n&&intervals[i][0]<=newInterval[1]){
                     m[0]=Math.min(intervals[i][0],     m[0]);
                     m[1]=Math.max(intervals[i][1],     m[1]);
                    
                    i++;
                }
        al.add(m);
                while(i<n){
            al.add(intervals[i]);
            i++;
        }
int res[][]=new int[al.size()][2];
        for(int element=0;element<al.size();element++){
            res[element]=al.get(element);
        }
    return res;
    }
}

    
                    
