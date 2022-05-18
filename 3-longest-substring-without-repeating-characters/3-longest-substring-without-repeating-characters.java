class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
for(int i=0;i<s.length();i++){
    if(map.containsKey(s.charAt(i))){
        len=0;
        i=map.get(s.charAt(i))+1;
        map.clear();
    }
        map.put(s.charAt(i),i);
        len++;
        max=Math.max(len,max);
    
}
        return max;
}
}