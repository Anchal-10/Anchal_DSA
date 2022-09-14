class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            if(!isPallindromic(i,n)){
                return false;
            }
        }
        return true;
    }
    public boolean isPallindromic(int i,int n){
        StringBuilder m=new StringBuilder();
        while(n>0){
            int r=n%i;
        m.append(r);
        n=n/i;
        }
        String temp=m.toString();
        String temp1=new String(m.reverse());
        if(!temp1.equals(temp)){
            return false;
            
        }
        return true;
    }
}

    
    
