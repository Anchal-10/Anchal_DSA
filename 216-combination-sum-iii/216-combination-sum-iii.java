class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list=new ArrayList<>();
        solve(k,n,1,list,new ArrayList<>());
        return list;
    }
    
    
    public void solve(int k,int n,int ind,List<List<Integer>> al,List<Integer> temp){
            if(n==0&&temp.size()==k){
            al.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<=9;i++){
            if(i>n){
                break;
            }
            temp.add(i);
            solve(k,n-i,i+1,al,temp);
            temp.remove(temp.size()-1);
        }
        
    }
}