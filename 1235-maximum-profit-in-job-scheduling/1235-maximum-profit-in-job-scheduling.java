class job{
    int start;
    int end;
    int profit;
 public job(int start,int end,int profit){
     this.start=start;
     this.end=end;
     this.profit=profit;
    }
}
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<job> jobs=new ArrayList<>();
        for(int i=0;i<startTime.length;i++){
            jobs.add(new job(startTime[i],endTime[i],profit[i]));
        }
                     
                     Collections.sort(jobs,(a,b)-> a.end-b.end);
        int max=0;
TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<jobs.size();i++){
            Integer m= map.floorKey(jobs.get(i).start);
            int currp= m==null? 0: map.get(m);
            max=Math.max(max,currp+ jobs.get(i).profit);
            map.put(jobs.get(i).end,max);
        }
    return max;
    }
}
