class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=Integer.MIN_VALUE;
        while(i<=j){
            int min=Math.min(height[i],height[j]);
            int area=(j-i)*min;
            max=Math.max(area,max);
            if(height[i]<height[j]){
                i++;
                
            }
            else{
                j--;
            }
        }
        return max;
        
    }
}