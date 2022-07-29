class Solution {
    int count=0;
    public int countArrangement(int n) {
        boolean visit[]=new boolean[n+1];
        helper(visit,1,n);
        return count;
    }
    public void helper(boolean[]visit,int ind,int n){
if(ind>n){
    count++;
    return;
    
}
        for(int i=1;i<=n;i++){
if(!visit[i]&& (ind%i==0|| i%ind==0)){
    visit[i]=true;
    helper(visit,ind+1,n);
    visit[i]=false;
}}
    
    
    }
}