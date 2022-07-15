class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
map.put(ch,map.getOrDefault(ch,0)+1);
        } 
        
        System.out.print(map);
                HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch: t.toCharArray()){
map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
                System.out.print(map2);

        int count=0;
        for(char char1:map.keySet()){
            if(!map2.containsKey(char1)){
                count+=map.get(char1);
            }
            else{
                int m=map2.get(char1);
                if(m>map.get(char1)){
                    count+=m-map.get(char1);
                }
            }
        }
                for(char char1:map2.keySet()){
            if(!map.containsKey(char1)){
                                count+=map2.get(char1);

            }
            else{
                int m=map.get(char1);
                if(m>map2.get(char1)){
                    count+=m-map2.get(char1);
                }
            }
        }
        return count;

        
        

    }
}