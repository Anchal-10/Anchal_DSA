class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: arr){
map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> {
            if(map.get(a)==map.get(b)){
                return a-b;
            }
            else{
                return map.get(b)-map.get(a);
            }
        });
        pq.addAll(map.keySet());
        int m=arr.length;
        int count=0;
        int ans=0;
        while(!pq.isEmpty()){
          int i=  pq.poll();
            count++;
            m=m-map.get(i);
            if(m<=(arr.length/2)){
                ans=count;
                break;
            }
        }
        return ans;
        
    }
}
