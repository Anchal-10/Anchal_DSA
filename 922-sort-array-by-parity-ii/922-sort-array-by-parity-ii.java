class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int j=0;
        int k=1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            res[j]=nums[i];
                j+=2;
            }
            else{
                            res[k]=nums[i];
                k+=2;
            }

            }
        return res;
        }
    }
