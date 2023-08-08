
class Solution {
    public long minCost(int[] nums, int[] cost) {

        int n = nums.length;
        // weighted array median prep.
        int[][] arr = new int[n][2];
        long total = 0L;
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = cost[i];
            total += cost[i];
        }
        
        Arrays.sort(arr, (a, b) -> (a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]));
        long cnt = 0L;
        long median = 0L;
        // traverse to find median
        for (int[] x : arr) {
            cnt += x[1];
            if (cnt > total / 2) {
                median = x[0];
                break;
            }
        }
        
        // all numbers become to median
        long ret = 0L;
        for (int i = 0; i < n; i++) {
            ret += Math.abs(nums[i] - median) * cost[i];
        }
        return ret;
        
    }}

