class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0]? a[1]-b[1]: a[0]-b[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            int right=intervals[i][1];
                        int left=intervals[i][0];
            if(!pq.isEmpty()&& pq.peek()<left){
                pq.poll();
            }
            pq.offer(right);

        }
        return pq.size();
    }
}