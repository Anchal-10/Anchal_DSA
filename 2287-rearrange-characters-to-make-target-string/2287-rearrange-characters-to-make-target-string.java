class Solution {
    public int rearrangeCharacters(String s, String target) {
int min=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
                HashMap<Character,Integer> kmap=new HashMap<>();
        for(char ch:target.toCharArray()){
            kmap.put(ch,kmap.getOrDefault(ch,0)+1);
        }
        for(char i: kmap.keySet()){
            if(!map.containsKey(i)){
                min=0;
                break;
            }
            else{
                int m=map.get(i);
                int n=kmap.get(i);
                min=Math.min(m/n,min);
                
            }
        }
return min;
    }
}
        