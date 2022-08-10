class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
         map.put(ch,i);
        }
        int max=0;
        int prev=-1;
        for(int i=0;i<s.length();i++){
            int v=map.get(s.charAt(i));
            max=Math.max(max,v);
            if(i==max){
                res.add(max-prev);
                prev=max;
            }
        }
    return res;
        }
        
    }