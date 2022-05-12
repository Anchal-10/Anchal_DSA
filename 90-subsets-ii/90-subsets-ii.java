class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> al=new ArrayList<>();
        Arrays.sort(nums);
        solve(al,new ArrayList<>(),0,nums);
        return al;
    }
    
    public void solve(List<List<Integer>> res,List<Integer> temp,int ind,int[]a){
        res.add(new ArrayList<>(temp));
        for(int i=ind;i<a.length;i++){
                             if(i==ind|| i>ind&& a[i]!=a[i-1]){

            temp.add(a[i]);
            solve(res,temp,i+1,a);
            temp.remove(temp.size()-1);
        }
    }
}
}