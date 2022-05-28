class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0||(i>0)&& nums[i]!=nums[i-1]){
                int sum=0-nums[i];
                int j=i+1;
                int k=nums.length-1;
                while(j<k){
                    if(nums[j]+nums[k]==sum){
                        al.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<nums.length-1&&nums[j]==nums[j+1]){
                            j++;
                        }
                                                while(k>0&&nums[k]==nums[k-1]){
                            k--;
                        }
                        j++;
                        k--;
                    }
                    else if(k>0&&nums[j]+nums[k]<sum){
j++;
                    }
                                        else if(nums[j]+nums[k]>sum){
k--;
                    }

                        

                    }
                }
            }
        return al;
        }
    }