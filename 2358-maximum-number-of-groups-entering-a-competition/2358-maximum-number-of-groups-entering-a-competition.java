class Solution {
    public int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int sum=0;
        int count=0;
for(int i=1;i<=grades.length;i++){
            sum+=i;

    if(sum<=grades.length){
                
        count++;
    }
    else{
        break;
    }
}
        return count;
    }
}