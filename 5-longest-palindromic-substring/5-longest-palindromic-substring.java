class Solution {
    public String longestPalindrome(String s) {
boolean dp[][]=new boolean[s.length()][s.length()];
            String rev="";
    int l=-1;
        int m=-1;
        for(int gap=0;gap<s.length();gap++){
for(int i=0, j=i+gap;j<s.length();j++,i++){
    
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
    if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true){
        dp[i][j]=true;

    }
        else{
            dp[i][j]=false;
        }
}
    if(dp[i][j]){
        l=i;
        m=j;
    }
            }
            
        }
             return s.substring(l,m+1);

    }
}
