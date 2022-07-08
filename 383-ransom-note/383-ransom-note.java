class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:ransomNote.toCharArray()) {
map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.print(map);
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
              int m=  map.get(magazine.charAt(i));
                m=m-1;
                map.put(magazine.charAt(i),m);
                if(m==0){
map.remove(magazine.charAt(i));
                }
            }
        }
        System.out.print(map);
        
        return map.isEmpty();
    }
}