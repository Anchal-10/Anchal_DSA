class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int s=0;
        while(temp>0){
            int r=temp%10;
            s=s*10+r;
           temp= temp/10;
        }
        if(s==x){
return true;
        }
        else{
return false;
        }
}
}