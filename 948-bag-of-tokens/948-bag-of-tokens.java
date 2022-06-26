class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int i=0;
        int j=tokens.length-1;
        int max=0;
                if(tokens.length == 0 || tokens[0] > power)
            return score;

        while(i<=j){
if(tokens[i]>power){
    power=power+tokens[j];
    score--;
    j--;
}
            else if(power>=tokens[i]){
                power=power-tokens[i];
                score++;
                i++;
            }
            max=Math.max(max,score);
        }
        return max;
    }
}