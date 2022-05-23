class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int diff[]=new int[capacity.length];
        for(int i=0;i< capacity.length;i++){
            diff[i]=capacity[i]-rocks[i];
        }
                Arrays.sort(diff);

        int ans=0;
        for(int i: diff){
            if(i<=additionalRocks){
               additionalRocks= additionalRocks-i;
            
            ans++;
        }
        }
        return ans;
    }
}