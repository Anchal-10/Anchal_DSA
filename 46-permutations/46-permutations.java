class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        boolean[]visited=new boolean[nums.length];
        
        solve(list,new ArrayList<>(),nums,visited);
        return list;
    }
    public void solve(List<List<Integer>> list,List<Integer> al,int[] nums,boolean[]visited){
        if(al.size()==nums.length){
            list.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                al.add(nums[i]);
                visited[i]=true;
                solve(list,al,nums,visited);
                al.remove(al.size()-1);
                visited[i]=false;
            }
        }
    }
}