class MyCalendar {
Map<Integer,Integer> map;
    public MyCalendar() {
        map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
       map.put(start,map.getOrDefault(start,0)+1);
               map.put(end,map.getOrDefault(end,0)-1);

        int sum=0;
        for(Map.Entry<Integer,Integer> es: map.entrySet()){
            sum+=es.getValue();
            if(sum>1){
                       map.put(start,map.getOrDefault(start,0)-1);
                if(map.get(start)==0){
                    map.remove(start);
                }
               map.put(end,map.getOrDefault(end,0)+1);
                                if(map.get(end)==0){
                    map.remove(end);
                }


                return false;
            }
        }
                    return true;

    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */