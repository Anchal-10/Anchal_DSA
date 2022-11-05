class Solution {
    
    public int longestArithSeqLength(int[] nums) {
        
HashMap<Integer,Integer> []dp=new HashMap[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=new HashMap<>();
        }
        int maxres=0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int diff=nums[j]-nums[i];
                int len=2;
                if(dp[j].containsKey(diff)){
                    len=dp[j].get(diff)+1;
                }
                int curr=dp[i].getOrDefault(diff,0);
                dp[i].put(diff,Math.max(curr,len));
                maxres=Math.max(maxres,dp[i].get(diff));
                
            }
        }
    return maxres;
    }
}

                     /**   if (dp[j].containsKey(d)) {
                    // At index j, if we had already seen a difference d,
                    // then potentially, we can add A[i] to the same chain
                    // and extend it by length 1.
                    len = dp[j].get(d) + 1;
                }
                
                // Obtain the maximum chain length already seen so far at index i 
                // for the given differene d;
                int curr = dp[i].getOrDefault(d, 0);
                
                // Update the max chain length for difference d at index i.
                dp[i].put(d, Math.max(curr, len));
                
                // Update the global max.
                longest = Math.max(longest, dp[i].get(d));
            }
        }
        
        return longest;***/
