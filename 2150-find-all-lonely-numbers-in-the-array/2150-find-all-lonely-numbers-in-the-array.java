class Solution {
    public List<Integer> findLonely(int[] nums) {
HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        System.out.print(map);
        List<Integer> al=new ArrayList<>();
        for(int i: map.keySet()){
            int temp=i+1;
            int temp2=i-1;
            if(!map.containsKey(temp)&& !map.containsKey(temp2)&& map.get(i)==1){
                al.add(i);
            }
        }
        return al;
    }
}
