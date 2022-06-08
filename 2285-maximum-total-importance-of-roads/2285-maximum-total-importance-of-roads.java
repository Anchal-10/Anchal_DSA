class Solution {
    public long maximumImportance(int n, int[][] roads) {
    int indegree[]=new int[n];
        for(int[]m: roads){
           indegree[m[0]]++;
                       indegree[m[1]]++;

        }
        long res=0;
        Arrays.sort(indegree);
        for(int i=0;i<n;i++){
        res+=(long)indegree[i]*(i+1);
}
        return res;
    }
}