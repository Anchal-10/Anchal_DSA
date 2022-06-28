class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        HashSet<Integer> set=new HashSet<>();
        int del=0;
        for(int m: map.values()){
            
            if(!set.contains(m)){
                set.add(m);
}
            else{
                while(set.contains(m) && m>0){
                    m--;
                    del++;
                }
                if(m>0){
set.add(m);
                }
            }
            
        }
        return del;
    }
}