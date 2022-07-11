class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int ans=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(prices[i]-min,max);
        }
        return max;
    }
}