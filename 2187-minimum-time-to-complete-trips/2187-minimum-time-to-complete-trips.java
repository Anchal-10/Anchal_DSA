class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        
        long low = 0;
        long high = (long)(1e14); // from constraint
        while (low <= high) {
            long middle = low + (high - low) / 2;
            if (countTrip(time, middle) >= totalTrips) {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return low;
    }
    
    public long countTrip(int [] time, long currentTime) {
        long countTrip = 0;
        for (int t : time) {
            countTrip += (currentTime / t);
        }
        return countTrip;
    }
}
