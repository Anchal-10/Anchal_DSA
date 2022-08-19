class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i: arr){
            int  rem=i%k;
            if(rem<0){
rem=rem+k;
            }
           map.put(rem,map.getOrDefault(rem,0)+1);
            
        }
        System.out.print(map);
        int c=0;
        for(int i: arr){
            int rem=i%k;
            if(rem==0){
                int freq=map.get(rem);
                if(freq%2!=0){
//return false;
                }
                else {
                    c++;
                }
                
            }
            else if(2*rem==k){
                                int freq=map.get(rem);
                if(freq%2!=0){
//return false;
                }
                else{
                    c++;
                }

            }
            else{
                                                int freq=map.getOrDefault((rem),0);
                                int ofreq=0;
                if(map.containsKey(k-rem)){
                    ofreq=map.get(k-rem);
                }
            if(freq!=ofreq){
                //return false;
            }
                else{
                    c++;
                }

                
            }
        }
        System.out.print(c);
        return c==arr.length;
    }
}