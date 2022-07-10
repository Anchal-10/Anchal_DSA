class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map=new HashMap<>();
        int res=0;
        String rev="";
            for(int i=0;i<words.length;i++){
          rev=rev+words[i].charAt(1)+          words[i].charAt(0) ;
if(map.containsKey(rev)){
    res+=4;
    int m=map.get(rev);
    m=m-1;
    map.put(rev,m);
    if(m==0){
        map.remove(rev);
    }
    rev="";
    continue;
    
}
                map.put(words[i],map.getOrDefault(words[i],0)+1);
                rev="";
            }
        for(String m: map.keySet()){
            if(m.charAt(0)==m.charAt(1)){
                res+=2;
                break;
            }
        }
        return res;
    }
}
        