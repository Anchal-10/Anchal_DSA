class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int sum=0;
        for(int i=0;i<bank.length;i++){
            String m=bank[i];
            int count=0;
            for(int j=0;j<m.length();j++){
                if(m.charAt(j)=='1' ){
count++;
                }
            }
                if(count>0){
                                sum=sum+(prev*count);
                    

                prev=count;
                }
                
            }
        
        return sum;
    }
}