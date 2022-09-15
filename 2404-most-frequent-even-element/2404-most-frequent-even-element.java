class Solution {
    public int mostFrequentEven(int[] nums) {
        
HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            if(i%2==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((o1,o2)->{
            if(map.get(o1)==map.get(o2)){
                return o1-o2;
            }
            return map.get(o2)-map.get(o1);
        });
        pq.addAll(map.keySet());
        return pq.isEmpty()?-1:pq.poll();
    }
}

