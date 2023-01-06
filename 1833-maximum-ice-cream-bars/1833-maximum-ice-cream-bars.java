class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
Arrays.sort(costs);
        int ans=0;
        int curr=0;
        for(int i=0;i<costs.length;i++){
if(costs[i]+curr<=coins){
    ans++;
    coins=coins-costs[i];
}
        }
        return ans;
    }
}
