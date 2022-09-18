class Solution {
    public int trap(int[] height) {
int [] maxleft=new int[height.length];
        maxleft[0]=height[0];
        for(int i=1;i<height.length;i++){
            maxleft[i]=Math.max(maxleft[i-1],height[i]);
        }
int maxright[]=new int[height.length];
        maxright[maxright.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxright[i]=Math.max(maxright[i+1],height[i]);
        }
        int ans=0;
for(int i=0;i<maxright.length;i++){
    ans=ans+(Math.min(maxright[i],maxleft[i])-height[i]);
}
        return ans;
    }
}