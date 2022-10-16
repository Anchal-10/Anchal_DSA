class Solution {
    public int countDistinctIntegers(int[] nums) {
        
    Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int revD=0;
            while(temp>0){
                int r=temp%10;
                revD=revD*10+r;
                temp=temp/10;
                
            }
           System.out.print(nums[i]+ " "+ revD+ "->");
 
            set.add(nums[i]);
            set.add(revD);
        }
      /*  for(int i: set){
System.out.print(i+ " ");
        }*/
        return set.size();
}
}