import java.util.*;
class Solution {
    public int fillCups(int[] amount) {
PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int i:amount){
pq.add(i);
        }
    int c=0;
        while(true){
            int first=pq.poll();
            int sec=pq.poll();
            if(first<=0&& sec<=0){
                break;
            }
            pq.add(first-1);
                        pq.add(sec-1);
            c++;

            
        }
    return c;
        
    }
}