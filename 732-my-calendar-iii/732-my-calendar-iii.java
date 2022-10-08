class MyCalendarThree {
    int max=0;
TreeMap<Integer,Integer> map;
    public MyCalendarThree() {
        map=new TreeMap<>();
    }
    
    public int book(int start, int end) {
        map.put(start,map.getOrDefault(start,0)+1);
                map.put(end,map.getOrDefault(end,0)-1);
        int c=0;
        for(int i: map.values()){
            c+=i;
                max=Math.max(c,max);
            
        }
        
    return max;

        
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(start,end);
 */