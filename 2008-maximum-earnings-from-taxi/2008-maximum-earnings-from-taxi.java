class Solution {
    public long maxTaxiEarnings(int n, int[][] rides) {
     long dp[]=new long[n+1];
        dp[0]=0;
        HashMap<Integer,List<int[]> >map=new HashMap<>();
for(int ride[]: rides){
    if(map.containsKey(ride[1])){
                List<int[]> temp=map.get(ride[1]);
                temp.add(ride);
        map.put(ride[1],temp);


        
    }
    else{
        List<int[]> temp=new ArrayList<>();
        temp.add(ride);
        map.put(ride[1],temp);
    }
}
        for(int i=1;i<=n;i++){
            if(map.containsKey(i)){
                List<int[]> temp=map.get(i);
                long max=0;
                for(int [] ele: temp){
                    max=Math.max(max,(long)(ele[1]-ele[0]+ele[2])+ dp[ele[0]]);
                }
                dp[i]=max;
            }
            dp[i]=Math.max(dp[i],dp[i-1]);
        }
    return dp[n];
    }
}

