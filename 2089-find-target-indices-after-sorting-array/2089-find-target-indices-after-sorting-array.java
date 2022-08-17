class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        for(int i: nums){
            System.out.print(i+ " ");
        }
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(nums[mid]==target){
                ans=mid;
              high=mid-1;
            }
            else if (nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        low=0;
        high=nums.length-1;
        int ans2=-1;
                while(low<=high){
            int mid=(low+high)>>1;
            if(nums[mid]==target){
                ans2=mid;
                                                              low=mid+1;

                      }
                    else if(nums[mid]<target){
                        low=mid+1;
                    }

            else{
            high=mid-1;
            }
        }
    
    System.out.print(ans+ "->");  
        System.out.print(ans2);        
List<Integer> res=new ArrayList<>();
        if(ans==-1&& ans2==-1){
            return res;
        }
        
        for(int i=ans;i<=ans2;i++){
            res.add(i);
        }
        return res;
    
    }
}
