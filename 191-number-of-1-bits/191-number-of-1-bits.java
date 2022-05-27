public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String m=Integer.toBinaryString(n);
        System.out.print(m);
        int c=0;
        for(int i=0;i<m.length();i++){
char ch=m.charAt(i);
        if(ch=='1'){
c++;
        }
        }
        return c;
    }
    
}