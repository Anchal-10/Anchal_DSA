class Solution {
    public String getHappyString(int n, int k) {
        if(n==1&& k>3){
            return "";
        }
        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        helper(res,n,k,'/',sb);
                if (res.size() < k) return "";

        return res.get(k-1);
    }
    public void helper(List<String> res,int n,int k,char prev_ch,StringBuilder sb){
        
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        
        for(char ch='a';ch<='c';ch++){
            if(ch!=prev_ch){
                sb.append(ch);
                helper(res,n,k,ch,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
}
}