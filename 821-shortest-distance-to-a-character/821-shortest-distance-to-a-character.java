class Solution {
    public int[] shortestToChar(String s, char c) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                set.add(i);
            }
        }
        int ans[]=new int[s.length()];
                for(int i=0;i<s.length();i++){
                    int min=Integer.MAX_VALUE;
                    for(int ele: set){
                        min=Math.min(min,Math.abs(i-ele));
                    }
                    ans[i]=min;
                    

        
    }
        return ans;
    }
}