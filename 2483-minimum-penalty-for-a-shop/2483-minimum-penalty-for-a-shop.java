class Solution {
    public int bestClosingTime(String customers) {
        int totalopen=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                totalopen++;
            }
        }
        int curropen=0;
        int currclose=0;
        int res=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<customers.length();i++){
            int penalty=totalopen-curropen+currclose;
            if(ans>penalty){
                ans=penalty;
                res=i;
            }
            curropen+=customers.charAt(i)=='Y'?1:0;
                        currclose+=customers.charAt(i)=='N'?1:0;

        }
                            int penalty=totalopen-curropen+currclose;
            if(ans>penalty){
                ans=penalty;
                res=customers.length();
            }
          //  curropen+=customers.charAt(i)=='Y'?1:0;
           //             currclose+=customers.charAt(i)=='N'?1:0;



        
        
        
        
    return res;
    }
}