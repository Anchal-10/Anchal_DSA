class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0){
return 0;
        }
        if(isPallindromic(s)){
return 1;
        }
        else{
return 2;
        }
    }
    public boolean isPallindromic(String s){
String rev="";
        int i=s.length()-1;
        while(i>=0){
            rev=rev+s.charAt(i);
            i--;
            
        }
        if(rev.equalsIgnoreCase(s)){
return true;
        }
        else{
            return false;
        }
}
}