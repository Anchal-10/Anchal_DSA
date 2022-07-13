class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int sum2=0;
        for(int i:gas){
sum+=i;
        }
                for(int i:cost){
sum2+=i;
        }
        if(sum2>sum){
return -1;
        }
        int start=0;
        int take=0;
        for(int i=0;i<gas.length;i++){
            take=take+gas[i]-cost[i];
            if(take<0){
                take=0;
                start=i+1;
            }
        }
        return start;
        

    }
}