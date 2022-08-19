class Solution {
    public boolean winnerOfGame(String colors) {
        int countA=0;
        int countB=0;
        for(int i=1;i<colors.length()-1;i++){
        char ch=colors.charAt(i);
            if(ch=='A' && colors.charAt(i-1)==ch&& colors.charAt(i+1)==ch){
countA++;
            }
            else             if(ch=='B' && colors.charAt(i-1)==ch&& colors.charAt(i+1)==ch){
countB++;
            }

        }
    return countA>countB;
    }
}