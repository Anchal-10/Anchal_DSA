class Solution {
    public boolean isMatch(String s, String p) {
        return helper(0,0,s,p);
    }
    public boolean helper(int i, int j, String s, String p){
        if(i>=s.length() && j>=p.length()){
return true;
        }
        if(j>=p.length()){
return false;
        }
        
        boolean match = (i<s.length() )&& (p.charAt(j)==s.charAt(i) || (p.charAt(j)=='.'));
        if((j+1)<p.length() && p.charAt(j+1)=='*'){
return helper(i,j+2,s,p)|| (match &&helper(i+1,j,s,p));
        }
        if(match){
            return helper(i+1,j+1,s,p);

        }
        return false;
        
        
    }
}