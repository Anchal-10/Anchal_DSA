class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int c :nums3){
          for(int d: nums4){
              int s=c+d;
              if(map.containsKey(s)){
                  map.put(s,map.get(s)+1);
              }
              else{
                  map.put(s,1);
              }
    
    
}
    }
        int c=0;
                for(int a :nums1){
          for(int b: nums2){
int m=0-(a+b);
        if(map.containsKey(m)){
                c+=map.get(m);
        }
        
}
                    
                }
    return c;
    }
}