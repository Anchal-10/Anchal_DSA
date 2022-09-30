class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
    int leftToRight[]= new int[n];
        int righttoLeft[]=new int[n];
        Arrays.fill(leftToRight,1);
                Arrays.fill(righttoLeft,1);
        for(int i=1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                leftToRight[i]=leftToRight[i-1]+1;
            }
        }
        for(int i:righttoLeft ){
            System.out.print(i+ " ");
        }
                for(int i=n-2;i>=0;i--){
            if(nums[i+1]>=nums[i]){
                righttoLeft[i]=righttoLeft[i+1]+1;
            }
        }
    List<Integer> al=new ArrayList<>();
        for(int i=k;i<n-k;i++){
            if(leftToRight[i-1]>=k&& righttoLeft[i+1]>=k){
                al.add(i);
            }
        }
return al;
    }
}