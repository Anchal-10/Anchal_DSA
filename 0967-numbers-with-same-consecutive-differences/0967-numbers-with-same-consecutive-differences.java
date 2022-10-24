class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> al=new ArrayList<>();
for(int i=1;i<=9;i++){
helper(al,i,0,n,k,i);
}
        int ans[]=new int[al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }
        return ans;
    }
        public void helper(List<Integer> al,int currNum,int currInd,int n,int k,int prev){
            if(currInd==n-1){
                al.add(currNum);
                return;
            }
            int nextNum=prev+k;
            if(nextNum<=9){
                helper(al,(currNum*10)+nextNum,currInd+1,n,k,nextNum);
            }
            
            nextNum=prev-k;
                        if(k!=0&&nextNum>=0){
                helper(al,(currNum*10)+nextNum,currInd+1,n,k,nextNum);
            }

            
        }
}