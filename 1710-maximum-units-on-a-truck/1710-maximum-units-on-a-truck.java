class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int left=truckSize;
        int ans=0;
        
for(int i=0;i< boxTypes.length;i++){
    
    
    

    if(boxTypes[i][0]<=left){
        ans=ans+(boxTypes[i][0]*boxTypes[i][1]);
        left=left-boxTypes[i][0];
    }
    else{
        ans=ans+(left* boxTypes[i][1]);
        break;
    }
}
return ans;
    }

}