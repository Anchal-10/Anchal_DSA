class Solution {
    public List<List<Integer>> generate(int numRows) {
List<List<Integer>> res=new ArrayList<>();
        List<Integer> prev=null;
        for(int i=0;i<numRows;i++){
            List<Integer> curr=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0){
                    curr.add(1);
                }
                if(j!=0 && j==i){
                    curr.add(1);
                }
                else if(j>0&& j<i){
                    int m=prev.get(j-1)+prev.get(j);
                    curr.add(m);
                    
                }
                
            }
            res.add(curr);
            prev=curr;
        }
    return res;
    }
}