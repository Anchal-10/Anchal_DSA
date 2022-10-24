class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        
List<Long> res=new ArrayList<>();
        if(finalSum%2!=0){
            return res;
        }
        long i=2;
        while(i<=finalSum){
            res.add(i);
            finalSum=finalSum-i;
            i+=2;
        }
        long m=res.remove(res.size()-1);
        res.add(m+finalSum);
        return res;
    }
}
