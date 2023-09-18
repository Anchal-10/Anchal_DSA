class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int j=0;
        int ans=0;
        int cost=0;
        while(j<s.length()){
            cost=cost+(Math.abs((s.charAt(j)-'0')  -  (t.charAt(j)-'0')   ) );
            while(cost>maxCost){
                cost= cost-(Math.abs((s.charAt(i)-'0')  -  (t.charAt(i)-'0')   ) );
                i++;
                
            }
            ans= Math.max(j-i+1, ans);
            j++;
        }
        return ans;
    }
}