class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int s = spells.length;
        int p = potions.length;
        int[] result = new int[s];
        
        Arrays.sort(potions);
        
        for(int i = 0; i < s; i++) {
            int left = 0, right = p - 1;
            int index = -1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if((long)spells[i] * potions[mid] >=success) {
                    index = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            if(index == -1) result[i] = 0;
            else result[i] = p - index;
        }
        
        return result;
    }
}
