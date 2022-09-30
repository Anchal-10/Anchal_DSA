class Solution {
    public int[] frequencySort(int[] nums) {
HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((o1,o2)->{
            if(map.get(o1)==map.get(o2)){
                return o2-o1 ;
            }
            return map.get(o1)-map.get(o2);
        });
        pq.addAll(map.keySet());
        int res[]=new int[nums.length];
        int i=0;
    while(!pq.isEmpty()){
        int n=pq.peek();
        int m=map.get(pq.poll());
        while(m!=0){
            res[i++]=n;
            m--;
        }
    }
    return res;
        
    }
}
                                                      