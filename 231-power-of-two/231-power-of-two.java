class Solution {
    public boolean isPowerOfTwo(int n) {
        long num=1;
        while(num<n){
            num*=2;
        }
          return num==n;  
        
    }
}
