class Solution {
    public int candy(int[] ratings) {
        int res[]=new int[ratings.length];
Arrays.fill(res,1);
        for(int i=0;i<res.length-1;i++){
            if(ratings[i+1]>ratings[i]){
                res[i+1]=res[i]+1;
}
        }
        for(int ii:res){
            System.out.print(ii+ " ");
        }
                for(int i=res.length-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                if(res[i-1]<=res[i]){
                    res[i-1]=res[i]+1;
                }
}
        }
        int sum=0;
        for(int i: res){
sum=sum+i;
        }
    return sum;
    }
}