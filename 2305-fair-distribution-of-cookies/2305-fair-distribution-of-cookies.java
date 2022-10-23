class Solution {
    int res=Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        int children[]=new int[k];
        helper(cookies,k,cookies.length,0,children);
        return res;
    }
    public void helper(int []cookies,int k,int n,int ind,int []children){
        if(ind==n){
            int max=0;
            for(int i: children){
                max=Math.max(max,i);
            }
            res=Math.min(max,res);
            return;
        }
        for(int i=0;i<k;i++){
            children[i]+=cookies[ind];
                    helper(cookies,k,n,ind+1,children);
                        children[i]-=cookies[ind];


        }
    }
}