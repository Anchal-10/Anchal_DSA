class Solution {
    public int minimumNumbers(int num, int k) {
        if(num==0){
return 0;
        }
        if(k>num){
return -1;
        }
for(int i=1;(i*k)<=num&&i<=10;i++){
    if((num-(k*i))%10==0){
return i;
    }
}
    
            return -1;
        }
    }
