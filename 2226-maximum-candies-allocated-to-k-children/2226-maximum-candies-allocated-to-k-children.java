class Solution {
    
    public int maximumCandies(int[] candies, long k) {
        
        int max = 0;
        for (int i : candies) {
            max = (max > i) ? max : i;
        }
        int start = 1, end = max, mid = 0, res = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (isValid(candies, k, mid)) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
    private boolean isValid(int[] candies, long k, int mid) {
        long totalPiles = 0;
        for (int i : candies) {
            int toAdd = i / mid;
            totalPiles += toAdd;
        }
        return totalPiles >= k;
    }

}
