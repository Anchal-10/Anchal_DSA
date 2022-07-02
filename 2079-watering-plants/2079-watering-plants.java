class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cap=capacity;
        int j=0;
        int n=plants.length;
        int steps=0;
        while(j<n){
            if(plants[j]>cap){
                steps+=(j*2)+1;
                cap=capacity;
                cap=cap-plants[j];
            }
            else{
                steps++;
                cap=cap-plants[j];
            }
        j++;
        
    }
        return steps;
}
}
