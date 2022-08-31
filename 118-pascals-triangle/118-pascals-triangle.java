class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> prev=null;
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0|| j==i){
                    temp.add(1);
                }
                else{
temp.add(prev.get(j-1)+prev.get(j));
                }
}

            prev=temp;
            res.add(temp);
        }
        return res;
        }
    }