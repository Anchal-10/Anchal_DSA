class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
char ch[]=s.toCharArray();
            Arrays.sort(ch);
            return String.valueOf(ch);
        }
        String min=s;
        for(int i=1;i<s.length();i++){
            String sub=s.substring(i)+s.substring(0,i);
            if(min.compareTo(sub)>0){
                min=sub;
            }
        }
        return min;
    }
}
        