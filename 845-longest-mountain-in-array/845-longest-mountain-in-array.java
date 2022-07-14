class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3){
return 0;
        }
        int max=0;
for(int i=1;i<arr.length-1;i++){
    int count=0;
    if(arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
        count++;
        int j=i;
        while(j>0 && arr[j-1]<arr[j]){
j--;
        count++;
        }
        int k=i;
                while( k<arr.length-1&& arr[k+1]<arr[k]){
k++;
        count++;
        }
    }
    max=Math.max(max,count);
        

        
    }
        return max;
    
}
}