class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer> >list=new ArrayList<>();
        solve(list,new ArrayList<>(),0,nums);
        return list;
    }
    
    public void solve(List<List<Integer>> al,List<Integer> temp,int ind,int[]a){
        if(ind>=a.length){
            al.add(new ArrayList<>(temp));
            return;
        }
        temp.add(a[ind]);
        solve(al,temp,ind+1,a);
        temp.remove(temp.size()-1);
                solve(al,temp,ind+1,a);

    }
}