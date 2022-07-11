class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
    
        for(int i=1;i<colors.length;i++){
if(colors[0]!=colors[i]){
    max=Math.max(max,i);
}
        }
       for(int i=colors.length-2;i>=0;i--){
if(colors[colors.length-1]!=colors[i]){
    max=Math.max(max,colors.length-i-1);
}
        }return max;
    }
}
