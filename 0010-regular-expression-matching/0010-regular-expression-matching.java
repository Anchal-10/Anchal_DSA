class Solution {
    public boolean isMatch(String s, String p) {
            Boolean m[][]=new Boolean[s.length()+1][p.length()+1];

        return helper(0,0,s,p,m);
    }
    public boolean helper(int i, int j, String s, String p,  Boolean m[][]){
        if(i>=s.length() && j>=p.length()){
return true;
        }
        if(j>=p.length()){
return false;
        }
        if(m[i][j]!=null){
return m[i][j];
        }
        
        boolean match = (i<s.length() )&& (p.charAt(j)==s.charAt(i) || (p.charAt(j)=='.'));
        if((j+1)<p.length() && p.charAt(j+1)=='*'){
return m[i][j]=helper(i,j+2,s,p,m)|| (match &&helper(i+1,j,s,p,m));
        }
        if(match){
            return m[i][j]= helper(i+1,j+1,s,p,m);

        }
        return false;
        
        
    }
}