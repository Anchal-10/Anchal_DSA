class Solution {
    public boolean checkDistances(String s, int[] distance) {
HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int diff=i-map.get(s.charAt(i))-1;
                if(diff!=distance[s.charAt(i)-'a']){
                    return false;
                    
                }
            }
            else{
                map.put(s.charAt(i),i);
            }
        }
        return true;
    }
}