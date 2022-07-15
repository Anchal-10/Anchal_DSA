class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int sec=0;
while(tickets[k]!=0){
    if(tickets[i]!=0){
        tickets[i]=tickets[i]-1;
        sec++;
    }
    i++;
        if(i==tickets.length){
            i=0;
        }

    
}
        return sec;
    }
}
