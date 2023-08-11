class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
// int ans= helper(amount, coins, coins.length-1);
//         return ans;
//     }
// public int helper(int amount, int []coins, int i){
//     if(i==0){
//         if(amount%coins[i]==0){
//             return 1;
//         }
//         return 0;      
//     }
        for(int i=0;i<amount+1;i++){
            dp[0][i]= i%coins[0]==0?1:0;
        }
        for(int i=1;i<coins.length;i++){
            for(int j=0;j<amount+1;j++){
    int no= dp[i-1][j];
    int yes=0;
    if(coins[i]<=j){
        yes= dp[i][j-coins[i]];
    }
   dp[i][j]= yes+no;
}
        }
        return dp[coins.length-1][amount];
    }
}

