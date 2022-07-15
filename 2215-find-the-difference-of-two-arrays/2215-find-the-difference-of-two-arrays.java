class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i:nums1){
set.add(i);
        }
                Set<Integer> set2=new HashSet<>();
        for(int i:nums2){
set2.add(i);
        }
        List<Integer> al=new ArrayList<>();
        for(int i:set){
            if(!set2.contains(i)){
                al.add(i);
            
            }
        }
                List<Integer> al2=new ArrayList<>();
        for(int i:set2){
            if(!set.contains(i)){
                al2.add(i);
            
            }
        }
        

            
            res.add(al);
        res.add(al2);
        
        
return res;
    }
}