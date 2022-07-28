class Solution {
    public boolean digitCount(String num) {
                HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            map.put(num.charAt(i)-'0',map.getOrDefault(num.charAt(i)-'0',0)+1);
                
        }
        System.out.print(map);
                        HashMap<Integer,Integer> kmap=new HashMap<>();
        for(int i=0;i<num.length();i++){
            kmap.put(i,num.charAt(i)-'0');
        }
        System.out.print(kmap);

        
for(int i=0;i<num.length();i++){
   if(map.get(i)!=null  && kmap.get(i)!=null&& map.get(i)!=kmap.get(i)){
       return false;
   }
       if(map.get(i)!=null  && kmap.get(i)==null){
           return false;
       }
   if(map.get(i)==null&& kmap.get(i)>0){
      return false;
   }

}
        return true;
    }
}


    