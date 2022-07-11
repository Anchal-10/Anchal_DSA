import java.util.*;
class Solution {
    public int fillCups(int[] amount) {
PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());
        for(int i:amount){
            pq.add(i);
        }
        int count=0;
        int first=0;
        int second=0;
        while(true){
             first=pq.poll();
            second=pq.poll();
            if(first<=0&&second<=0){
break;
            }
            pq.add(first-1);
            pq.add(second-1);
            count++;

        }
        return count;
    }
}