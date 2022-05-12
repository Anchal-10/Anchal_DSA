class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        solve(res,new ArrayList<>(),candidates,0,target);
        return res;
    }
    public void solve(List<List<Integer>> res,List<Integer> temp,int a[],int ind,int target){
                if(target==0){
                    res.add(new ArrayList<>(temp));
                    return;
                }
        for(int i=ind;i<a.length;i++){
            if(i>ind&& a[i]==a[i-1]){
                continue;
            }
                
            if(target<a[i]){
                break;
            }
            temp.add(a[i]);
            solve(res,temp,a,i+1,target-a[i]);
            temp.remove(temp.size()-1);
}
    }
    }