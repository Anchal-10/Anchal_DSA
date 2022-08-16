class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ch: barcodes){
map.put(ch,map.getOrDefault(ch,0)+1);
        }
      /*  System.out.print(map);
        return "";*/
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
return a-b;
            }
            else{
                return map.get(b)-map.get(a);
            }
        });
        pq.addAll(map.keySet());
        int res[]=new int[barcodes.length];
        int i=0;
while(pq.size()>1){
    int ch=pq.poll();
    int ch2=pq.poll();
    res[i]=ch;
    i++;
    res[i]=ch2;
    i++;
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
           int ch=pq.poll();
                res[i]=ch;
                i++;
            }
        
            return res;

}
}



            
            
    
