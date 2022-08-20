class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0|| nums[i-1]!=nums[i]){
                int temp=0-nums[i];
                int j=i+1;
                int k=nums.length-1;
                while(j<k){
                    if(nums[j]+nums[k]==temp){
                        al.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<nums.length-1&&nums[j+1]==nums[j]){
                     j++;
                    }
                                        while(k>0&&nums[k-1]==nums[k]){
                     k--;
                    }
                                                                j++;
                        k--;


                }
                    else if(nums[j]+nums[k]<temp){
                                            j++;
                                        }

                    else{
                        k--;
                    }
                }
            }
        }
        return al;
    }
}