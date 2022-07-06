class Solution {
    int c=0;
    public boolean isSubsequence(String s, String t) {
    boolean m=solve(s,t,s.length(),t.length());
        return m;
        
    }
        public boolean solve(String s,String t, int m,int n){

            
            if(m==0){
return true;
            }
            if(n==0){
return false;
            }
            

            
        
            if(s.charAt(m-1)==t.charAt(n-1)){
               return  solve(s,t,m-1,n-1);
            }
                            
           return    solve(s,t,m,n-1);

                        }
        
    }
            
