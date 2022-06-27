class Solution {
    public int longestSubstring(String s, int k) {
        if(k==0|| k==1){
return s.length();
        }
        if(s.length()==0){
return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int i=0;
        while(i<s.length()&& map.get(s.charAt(i))>=k){
i++;
        }
        if(i>=s.length()){
return i;
        }
        int l1=longestSubstring(s.substring(0,i),k);
                while(i<s.length()&& map.get(s.charAt(i))<k){
                    i++;

    }
                int l2=(i<s.length())?longestSubstring(s.substring(i),k):0;
        return Math.max(l1,l2);

}
}
