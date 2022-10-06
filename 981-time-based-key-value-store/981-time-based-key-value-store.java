class pair{
      String val;
      int time;
public pair(String val,int time){
      this.val=val;
      this.time=time;
    }
}
class TimeMap {
Map<String,List<pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            List<pair> al=map.get(key);
            al.add(new pair(value,timestamp));
            map.put(key,al);
            
        }
        else{
            List<pair> al=new ArrayList<>();
            al.add(new pair(value,timestamp));
            map.put(key,al);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
return "";
        }
        else{
            return binarySearch(key,timestamp,map);
        }
    }
    public String binarySearch(String key,int timestamp,Map<String,List<pair>> map){
List<pair> al=map.get(key);
    int low=0;
        int high=al.size()-1;
        String str="";
        while(low<=high){
            int mid=(low+high)>>1;
            if(al.get(mid).time==timestamp){
                return al.get(mid).val;
            }
            else if(al.get(mid).time<timestamp){
                str=al.get(mid).val;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
    return str;
    }
}
