class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
map.put(ch,map.getOrDefault(ch,0)+1);
        }
      /*  System.out.print(map);
        return "";*/
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
return a-b;
            }
            else{
                return map.get(b)-map.get(a);
            }
        });
        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
while(pq.size()>1){
    char ch=pq.poll();
    char ch2=pq.poll();
    sb.append(ch);
    sb.append(ch2);
     map.put(ch,map.getOrDefault(ch,0)-1);

    if(map.get(ch)==0){
        map.remove(ch);
    }
    else     if(map.get(ch)>0){
        pq.add(ch);
    }
         map.put(ch2,map.getOrDefault(ch2,0)-1);

    if(map.get(ch2)==0){
        map.remove(ch2);
    }
    else     if(map.get(ch2)>0){
        pq.add(ch2);
    }
}
        while(!pq.isEmpty()){
           char ch=pq.poll();
            if(map.get(ch)>1){
                return "";
            }
            else{
                sb.append(ch);
            }
        }
            return sb.toString();
    }
}

            
            
    
