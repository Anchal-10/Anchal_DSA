class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        int MOD = (int) Math.pow(10, 9) + 7;
        int m = horizontalCuts.length, n = verticalCuts.length;

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long maximumHorizontal = horizontalCuts[0], maximumVertical =verticalCuts[0] ;

        
        for (int i = 0; i < m - 1; i++){
            maximumHorizontal = Math.max(maximumHorizontal, horizontalCuts[i + 1] - horizontalCuts[i]);

        }
        maximumHorizontal = Math.max(maximumHorizontal, h - horizontalCuts[m - 1]);

        
        for (int i = 0; i < n - 1; i++){
            maximumVertical = Math.max(maximumVertical, verticalCuts[i + 1] - verticalCuts[i]);
        }
		
       maximumVertical = Math.max(maximumVertical, w - verticalCuts[n - 1]);

        return (int)(maximumHorizontal * maximumVertical % MOD);
    }
}

