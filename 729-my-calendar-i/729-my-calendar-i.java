class MyCalendar {
    private class Pair{
        int st;
        int end;
        Pair(){}
        Pair(int st, int end){
            this.st = st;
            this.end = end;
        }
    }
    
    private List<Pair>al;
    public MyCalendar() {
        al = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(al.size()==0){
            al.add(new Pair(start, end));
            return true;
        }else{
            for(int i=0; i<al.size(); i++){
                Pair p = al.get(i);
                if(start<p.end && p.st<end) return false;
            }
        }
        al.add(new Pair(start, end));
        return true;
    }
}

