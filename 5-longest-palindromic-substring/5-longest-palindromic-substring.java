class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean [][]dp=new boolean[n][n];
        int l1=-1;
        int l2=-1;
        for(int gap=0;gap<s.length();gap++){
                    for(int i=0,j=i+gap;j<s.length();j++,i++){
                        if(gap==0){
                            dp[i][j]=true;
                        }
                        else if(gap==1){
                            if(s.charAt(i)==s.charAt(j)){
                                dp[i][j]=true;
                            }
                            else{
                                dp[i][j]=false;
                            }
                        }
                        else if(gap>1){
                                                        if(s.charAt(i)==s.charAt(j)&& dp[i+1][j-1]==true){
                                dp[i][j]=true;
                            }
                            else{
                                dp[i][j]=false;
                            }
                        }
                        if(dp[i][j]){
                            l1=i;
                            l2=j;
                        }

                            
                        }
        }
            return s.substring(l1,l2+1);

        
    }
}