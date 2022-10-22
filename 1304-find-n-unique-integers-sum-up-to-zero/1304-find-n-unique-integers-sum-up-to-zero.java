class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
int temp=1;
        int start=0;
        int end=n-1;
        while(start<end){
            ans[start]=temp;
              ans[end]=-temp;
            temp++;
            start++;
            end--;
        }
        return ans;
    }
}
