class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        combination(list,new ArrayList<>(),candidates,0,target);
        return list;
    }
    public void combination(List<List<Integer>> res,List<Integer> temp,int a[],int index,int target){
        if(index>=a.length){
            if(target==0){
            res.add(new ArrayList<>(temp));
        }
        return;
    }
        if(a[index]<=target){
            temp.add(a[index]);
                    combination(res,temp,a,index,target-a[index]);
            temp.remove(temp.size()-1);

        }
                combination(res,temp,a,index+1,target);

}
}
