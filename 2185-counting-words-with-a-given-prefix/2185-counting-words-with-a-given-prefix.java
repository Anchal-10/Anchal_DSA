class Solution {
    public int prefixCount(String[] words, String pref) {
        int m=pref.length();
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
            if(j<m && words[i].charAt(j)!=pref.charAt(j)){
                break;
            }
                if(j==m-1){
                    count++;
                }
            
        }
    }
        return count;
}
}