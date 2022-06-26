class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0;
        int sum=0;
        for(int i=0;i<k;i++){
               sum=sum+cardPoints[i];
        }
        max=sum;
        int m=k-1;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[cardPoints.length-1-i]-cardPoints[m];
            max=Math.max(max,sum);
            m--;
}
        return max;
    
    }
}