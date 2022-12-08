class Solution {
    public long dividePlayers(int[] skill) {
Arrays.sort(skill);
        int start=0;
        int end=skill.length-1;
        int diff=skill[start]+skill[end];
        long ans=0;
        while(start<end){
            ans=ans+(skill[start]*skill[end]);
            if(skill[start]+skill[end]!=diff){
return -1;
            }
            start++;
            end--;
            
        }
    return ans;
    }
}