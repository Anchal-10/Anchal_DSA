class Solution {
    public int subarraySum(int[] nums, int k) {
 HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        int c=0;
        int s=0;
        for (int i=0;i<nums.length;i++){
            s+=nums[i];
            if(map.containsKey(s-k)){
                c+=map.get(s-k);
            }
            map.put(s,map.getOrDefault(s,0)+1);
            
        }
        return c;
    }
}