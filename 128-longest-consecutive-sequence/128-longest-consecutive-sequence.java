class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans=0;
        int longeststreak=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int currstreak=1;
                int currnum=nums[i];
                while(set.contains(currnum+1)){
                    currstreak+=1;
                    currnum=currnum+1;
                }
                longeststreak=Math.max(longeststreak,currstreak);
                
            }
        }
        return longeststreak;
}
}