class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int max=Integer.MIN_VALUE;
    for(int i=0;i<matches.length;i++){
        max=Math.max(max,Math.max(matches[i][0],matches[i][1]));
    }
   // System.out.print(max) ;
    
    List<List<Integer>> res=new ArrayList<>();
int[]winner=new int[max+1];
        int[]looser=new int[max+1];
        for(int i=0;i<matches.length;i++){
            winner[matches[i][0]]++;
            looser[matches[i][1]]++;
        }
        List<Integer> al=new ArrayList<>();
for(int i=0;i<winner.length;i++){
    if(winner[i]>0 && looser[i]==0){
        al.add(i);
        
    }
}
        res.add(al);
            List<Integer> temp=new ArrayList<>();
for(int i=0;i<winner.length;i++){
    if(looser[i]==1){
        temp.add(i);
        
    }
}
        res.add(temp);
    return res;
    }
}