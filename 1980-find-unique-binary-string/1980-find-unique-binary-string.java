class Solution {
    String res="";
    public String findDifferentBinaryString(String[] nums) {
Set<String> set=new HashSet<>();
        for(String str: nums){
set.add(str);
        }
        int arr[]=new int[]{0,1};
        StringBuilder sb=new StringBuilder();
        helper(set,arr,nums.length,0,sb);
        return res;
    }
public void         helper(Set<String>set,int[]arr,int n,int ind,StringBuilder str){
    if(ind==n){
        if(!set.contains(str.toString())){
            res=str.toString();
        }
        return;
    }
    for(int i: arr){
        str.append(i);
        helper(set,arr,n,ind+1,str);
        str.deleteCharAt(str.length()-1);
    }
}
    
}
