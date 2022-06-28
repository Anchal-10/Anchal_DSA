class Solution {
    public int minMoves(int target, int maxDoubles) {
        int m=target;
        int count=0;
        while(m!=1){
if(m%2!=0){
count++;
    m=m-1;
}
            else {
                if(maxDoubles>0){
                     maxDoubles--;
                    m=m/2;
                    count++;
                 }
                else{
                    count+=m-1;
                    m=1;
                }
            }
        }
        return count;
    }
}