
class tuple{
    int data;
    int listIndex;
    int index;
    public tuple(int data, int listIndex,int index){
        this.data=data;
        this.index=index;
        this.listIndex=listIndex;
    }
}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<tuple> pq=new PriorityQueue<>((a,b)-> a.data-b.data);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            pq.add(new tuple(nums.get(i).get(0), i,0));
            max=Math.max(nums.get(i).get(0), max);
        }
        int ans=Integer.MAX_VALUE;
        int start=0;
        int end=0;
while(!pq.isEmpty()){
    tuple t=pq.poll();
    int min=t.data;
    if(max-min<ans){
        ans=max-min;
        start=min;
        end=max;
    }
System.out.print(t.data + " " + max + " ?");
    int lind=t.listIndex;
    int ind=t.index;
    if(ind+1>=nums.get(lind).size()){
        break;
    }
    pq.offer(new tuple(nums.get(lind).get(ind+1), lind, ind+1));
    max=Math.max(max, nums.get(lind).get(ind+1));
    
}
        return new int[]{start, end};
    }
}
