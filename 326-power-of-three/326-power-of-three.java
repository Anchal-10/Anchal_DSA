class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){
return true;
        }
        if(n==0|| n<0){
return false;
        
        
        
        }
        while(n>0){
            if(n%3==0){
                
n=n/3;
            }
            if(n==0){
return true;
            }
            if(n==1){
                return true;
            }
            else if(n%3!=0){
return false;
            }
        }
        return true;
    }
}