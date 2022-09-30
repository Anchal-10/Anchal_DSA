class Solution {
    public String pushDominoes(String dominoes) {
int  right[]=new int[dominoes.length()];
        int nearestrightInd=-1;
        for(int i=0;i<dominoes.length();i++){
            char ch=dominoes.charAt(i);
            if(ch=='R'){
                
                nearestrightInd=i;
            }
            else if(ch=='L'){
                nearestrightInd=-1;
            }
            right[i]=nearestrightInd;
        }
        int  left[]=new int[dominoes.length()];

                int nearestleftInd=-1;
        for(int i=dominoes.length()-1;i>=0;i--){
            char ch=dominoes.charAt(i);
            if(ch=='L'){
                
                nearestleftInd=i;
            }
            else if(ch=='R'){
                nearestleftInd=-1;
            }
            left[i]=nearestleftInd;
        }
        char ch[]=new char[dominoes.length()];
        for(int i=0;i< ch.length;i++){
            char chr=         dominoes.charAt(i);
            if(chr=='.'){
                int nearL=left[i];
                int nearR=right[i];
                int leftdiff=nearL==-1?Integer.MAX_VALUE:Math.abs(nearL-i);
                                int rightdiff=nearR==-1?Integer.MAX_VALUE:Math.abs(nearR-i);

if(leftdiff==rightdiff){
ch[i]='.';
}
                else if(leftdiff>rightdiff){
                    ch[i]='R';
                }
                                else if(leftdiff<rightdiff){
                                    ch[i]='L';
                                }
            }
            else{
                ch[i]=dominoes.charAt(i);
            }
        }
        return new String(ch);
    }
}
        