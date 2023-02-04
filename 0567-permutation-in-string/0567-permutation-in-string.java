class Solution {
    public boolean checkInclusion(String s1, String s2) {
HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int i=0;
        int j=0;
        int cap=map.size();
        while(j<s2.length()){
            char ch=s2.charAt(j);
            if(map.containsKey(ch)){
                int m=map.get(ch);
                map.put(ch,m-1);
            
            if(map.get(ch)==0){
                cap--;
            }
        }
            if(j-i+1<s1.length()){
                j++;
            }
            else if(j-i+1==s1.length()){
                if(cap==0){
                    return true;
                }
                char ch1=s2.charAt(i);
                if(map.containsKey(ch1)){
                    int v=map.get(ch1);
                    map.put(ch1,v+1);
                
                if(map.get(ch1)==1){
cap++;
                }
                }
  

                
            
            i++;
                j++;
            }
        }
        return false;
    }
}


            