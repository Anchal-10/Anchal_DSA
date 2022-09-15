class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0){
return new int[]{};
             }
HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<changed.length;i++){
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
        }
        List<Integer> al=new ArrayList<>();
        Arrays.sort(changed);
                for(int i=0;i<changed.length;i++){
                    
                    if(map.get(changed[i])==0){
                        continue;
                    }
                    
                            if(map.containsKey(2*changed[i])&& map.get(2*changed[i])==0){
                                return new int[]{};
                            }

                    if(map.containsKey(0)&& map.get(0)%2!=0|| (!map.containsKey(2*changed[i]))){
                    return new int[]{};

    
                        
                    }
if(map.containsKey(changed[i])&& map.containsKey(2*changed[i])){
    al.add(changed[i]);
       map.put(changed[i],map.get(changed[i])-1);
           map.put(2*changed[i],map.get(2*changed[i])-1);

    
}
                }
    int ans[]=new int[al.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=al.get(i);
        }
    return ans;
    }
}

                    