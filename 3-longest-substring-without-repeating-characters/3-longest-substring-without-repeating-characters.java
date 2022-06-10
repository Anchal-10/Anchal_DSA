class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1==map.size()){
max=Math.max(max,map.size());
                j++;
                
            }
            else if(j-i+1>map.size()){
                while(j-i+1>map.size()){
                char ch=s.charAt(i);
                if(map.containsKey(ch)){
                    int m=map.get(ch);
                    map.put(ch,m-1);
                
                    if(map.get(ch)==0){
map.remove(ch);
                    }
            }
            
i++;
        }
                j++;
    }
}
        return max;
    }
}