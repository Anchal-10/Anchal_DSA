class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<ranges.length;i++){
           for(int j=ranges[i][0];j<=ranges[i][1];j++){
               set.add(j);
           }
        }
        System.out.print(set);
        for(int i = left; i <= right; i++) {
            if(!set.contains(i)) return false;
        }
        return true;
    }
}
