class Solution {
    public int divisorSubstrings(int num, int k) {
int i=0;
        int j=0;
        int c=0;
        String m=Integer.toString(num);
        while(j<m.length()){
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                String v=m.substring(i,j+1);
            int d=Integer.parseInt(v);
                if(d==0){
                    i++;
                    j++;
                    continue;
                }
                if(num%d==0){
                    c++;
                }
                i++;
                j++;
            }
        }
        return c;
    }
}