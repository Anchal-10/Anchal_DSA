class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<>();
        for(String str: words){
            boolean flag=isPattern(str,pattern);
            if(flag){
                res.add(str);
            }
        }
        return res;
    }
    
    public boolean isPattern(String a,String b){
    HashMap<Character,Character> map=new HashMap<>();
    for(int i=0;i<a.length();i++){
        if(map.containsKey(a.charAt(i))){
            if(map.get(a.charAt(i))!=b.charAt(i)){
                return false;
            }
        }
  else      if(map.containsValue(b.charAt(i))){
return false;
        }
            
        
        else{
            map.put(a.charAt(i),b.charAt(i));
        }
    }
        return true;
    }
}