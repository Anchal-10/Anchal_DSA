class Solution {
    public int videoStitching(int[][] clips, int time) {
        
        Arrays.sort(clips, (ob1, ob2)-> ob1[0]- ob2[0]);
        
int start=0;
        int end=0;
        int count=0;
        int j=0;
        while(start<time){
            while(j<clips.length&& start>=clips[j][0]){
                end=Math.max(end,clips[j][1]);
                j++;
            }
            if(start==end){
return -1;
            }
            start=end;
            count++;
        }
        return count;
    }
}