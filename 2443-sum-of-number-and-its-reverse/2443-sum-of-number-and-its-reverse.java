class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        if(num == 0) return true;
        for(int i =1; i<num; i++){
            StringBuilder sb = new StringBuilder(i+"");
            String st = sb.reverse().toString();
            int val = Integer.parseInt(st);
            if(val + i == num){
                
                return true;
            }
        }
        return false;
    }
}
