class Solution {
    public boolean isHappy(int n) {
        int count=countDigits(n);
        while(count>1){
            int temp=square(n);
            n=temp;
            count=countDigits(n);
           }
        if(n==1|| n%7==0){
            return true;
        }
        else{
            return false;
        }     
    }
    public int square(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=Math.pow(rem,2);
            temp=temp/10;
        }
        return sum;
    }
    public int countDigits(int n){
        int c=0;
                int temp=n;
        while(temp>0){
            c++;
            int rem=temp%10;
            temp=temp/10;
        }
        return c;
    }     
    }