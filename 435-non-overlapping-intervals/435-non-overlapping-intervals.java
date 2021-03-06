class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // A variable to count the minimum number of elements we need to remove
        int count = 0;
        
        // Sort the 2D array according to the last element of each row
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        // The first row
        int[] previous = intervals[0];
        
        // Loop in the 2D array starting from the second row
        for(int i=1; i<intervals.length; i++) {
            
            // the ith row of the 2D array
            int[] current = intervals[i];
            
            // if the last element of the (i-1)th row is bigger than the first element in the (i)th row increment the counter
            // and continue with the loop (because we don't need the (i-1)th row to change)
            if(previous[1] > current[0]) {
                
                count++;
                continue;
            }
            
            // if the last element of the (i-1)th row is less than or equal to the first element in the (i)th row we need to change the 
            // (i-1)th row to the (i)th row and the (i)th row will be changed to the next row of the 2D array in the start of the loop
            previous = current;
        }
        
        return count;
    }
}
