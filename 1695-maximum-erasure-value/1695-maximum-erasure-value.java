class Solution {
    public int maximumUniqueSubarray(int[] nums) {
         HashMap<Integer,Integer> hm=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        int sum=0;
        while(j<nums.length)
        {
            sum+=nums[j];
            if(hm.containsKey(nums[j]))
            {
                hm.put(nums[j],hm.get(nums[j])+1);
            }
            else
            {
                hm.put(nums[j],1);
            }
            if(j-i+1==hm.size())
            {
                max=Math.max(sum,max);
                j++;
            }
            else if(hm.size()<j-i+1)
            {
                while(hm.size()<j-i+1)
                {
                    if(hm.containsKey(nums[i]))
                    {
                         hm.put(nums[i],hm.get(nums[i])-1);
                        sum-=nums[i];
                    
                    if(hm.get(nums[i])==0)
                    {
                        hm.remove(nums[i]);
                    }
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
        
    }
}
