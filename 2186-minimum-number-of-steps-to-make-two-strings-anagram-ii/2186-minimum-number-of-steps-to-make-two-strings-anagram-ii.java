class Solution {
    public int minSteps(String s, String t) {
        
HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch: t.toCharArray()){
map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        
        int ans=0;
        for(char ch: map.keySet()){
            if(!map2.containsKey(ch)){
                ans+=map.get(ch);
            }
            else{
                int m=map2.get(ch);
                if(m> map.get(ch)){
                    ans+=m-map.get(ch);
                }
            }
            
}
               // int ans=0;
        for(char ch: map2.keySet()){
            if(!map.containsKey(ch)){
                ans+=map2.get(ch);
            }
            else{
                int m=map.get(ch);
                if(m> map2.get(ch)){
                    ans+=m-map2.get(ch);
                }
            }
            
}
        return ans;
    }}
        