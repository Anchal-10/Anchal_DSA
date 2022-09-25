class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap < Integer , String> map = new  HashMap<>();
         int n = names.length;
         for(int i = 0; i< n ; i++){
             map.put(heights[i], names[i]);
         }
        Arrays.sort(heights);
        int k = n-1;
        for( int i = 0;i< n ; i++){
            names[k--]=map.get(heights[i]);
        }
        return names;
    }
}
