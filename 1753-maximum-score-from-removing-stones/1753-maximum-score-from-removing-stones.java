class Solution {
    public int maximumScore(int a, int b, int c) {
    PriorityQueue<Integer> pq=new  PriorityQueue(Collections.reverseOrder());
        pq.add(a);        
        pq.add(b);
        pq.add(c);
    
int count=0;
        while(pq.size()>1){
            a=pq.poll();
            b=pq.poll();
            a=a-1;
            b=b-1;
            if(b>0){
                pq.add(b);
            }
                        if(a>0){
                pq.add(a);
            }
        count++;

        }
        return count;
    }
}