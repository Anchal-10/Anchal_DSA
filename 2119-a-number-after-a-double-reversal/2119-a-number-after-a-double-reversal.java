class Solution {
    public boolean isSameAfterReversals(int num) {
        int i=0;
        int temp=num;
        int d=0;
        while(i!=2){
        while(temp>0){
            int r=temp%10;
            d=d*10+r;
            temp=temp/10;
            
        }
            
            temp=d;
            d=0;
            i++;
    }
    System.out.print(temp);
    if(temp==num){
return true;
    }
    else{
return false;}
}
}