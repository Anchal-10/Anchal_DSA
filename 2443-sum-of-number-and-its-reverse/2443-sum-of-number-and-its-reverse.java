class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
            
        }
for(int i=1;i<=num;i++){
    int temp=i;
    int revD=0;
    while(temp>0){
int r=temp%10;
        revD=revD*10+r;
        temp=temp/10;
    }
    if(revD+i==num){
        return true;
    }
}
        return false;
    }
}