class Solution {
    public int kthFactor(int n, int k) {
        int c=0;
        int m=-1;
        for(int i=1;i<=n;i++){
if(n%i==0||i==1|| i==n){
    c++;
    if(c==k){
        m=i;
    }
}}
        return m;
    }
}