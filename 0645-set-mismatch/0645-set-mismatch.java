class Solution {
    public int[] findErrorNums(int[] nums) {
boolean[]visited=new boolean[nums.length+1];
        int res[]=new int[2];
        int sum=0;
        for(int i: nums){
            if(visited[i]){
                res[0]=i;
            }
            visited[i]=true;
            sum+=i;
        }
        int n=nums.length;
        int tsum=n*(n+1)/2;
        res[1]=res[0]+tsum-sum;
        return res;
    }
}

        