class Solution {
    public boolean canReach(int[] arr, int start) {
        
        
            if(start < 0 || start >= arr.length || arr[start] == -1) return false;
int v=arr[start];

        if(arr[start]==0){
return true;
        }
    arr[start]=-1;
        boolean m= canReach(arr,start+v);
        boolean n=canReach(arr,start-v);
      return   m||n;
    }
}