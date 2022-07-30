class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxcount=new int[26];
        for(String str: words2){
            int freq[]=helper(str);
            for(int i=0;i<26;i++){
                maxcount[i]=Math.max(maxcount[i],freq[i]);
            }
        }
        List<String> al=new ArrayList<>();
                for(String str: words1){
            int freq[]=helper(str);
            for(int i=0;i<26;i++){
if(freq[i]<maxcount[i]){
    break;
}
                if(i==25){
                    al.add(str);
                }
            }
                }
    
        return al;     
    }
    public int[] helper(String w){
        int a[]=new int[26];
        for(char ch: w.toCharArray()){
            a[ch-'a']++;
        }
        return a;
    }
}