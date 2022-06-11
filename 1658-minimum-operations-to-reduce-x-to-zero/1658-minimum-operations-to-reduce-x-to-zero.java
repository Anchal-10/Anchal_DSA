class Solution {
    public int minOperations(int[] nums, int x) {
        if(nums.length==0){
return -1;
        }
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int t=sum-x;
        if(t==0){
return nums.length;
        }
        int j=0;
        int i=0;
        int v=0;
        int max=0;
        while(j<nums.length){
            v=v+nums[j];
            if(v<t){
                j++;
            }
            else if(v==t){
                max=Math.max(j-i+1,max);
                j++;
            }
            else if(v>t){
                while(v>t&& i<nums.length){
                      v=v-nums[i];
                    i++;
                    if(v==t){
                    max=Math.max(max,j-i+1);
                    }
                }
                
                j++;
            }
        }
        if(max==0){
return -1;
        }
        else{
            return nums.length-max;
            
        }}
        
    }