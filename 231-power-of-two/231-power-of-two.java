class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
return true;
        }
        if(n==0|| n<0){
return false;
        }
while(n>0){
    if(n%2==0){
          n=n/2;
    }
    if(n==0){
return true;
    }
    if(n==1){
        return true;
    }
    else if(n%2!=0){
return false;
    }
}
        return true;
}
}