class Solution {
    public int maxResult(int[] nums, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        pq.add(new int[]{nums[0],0});
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++){
            while(!pq.isEmpty()&& k<i-pq.peek()[1]){
                pq.poll();
            }
            int curr=pq.peek()[0];
            max=curr+nums[i];
                    pq.add(new int[]{max,i});

        }
        return max;
    }
}