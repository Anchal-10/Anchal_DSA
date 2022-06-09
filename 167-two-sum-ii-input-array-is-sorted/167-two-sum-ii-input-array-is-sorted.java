class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        
       int low=0;
        int high=numbers.length-1;
        while(low<=high){
            if(numbers[low]+numbers[high]==target){
                a[0]=low+1;
                a[1]=high+1;
                return a;
            }
            else             if(numbers[low]+numbers[high]<target){
                low++;

        }
                       else if(numbers[low]+numbers[high]>target){
                           high--;

        }
    }
     a[0]=-1;
        a[1]=-1;
        return a;
}
}