class Solution {
    public String longestCommonPrefix(String[] strs) {
String ans="";
        int index=0;
        for(char c:strs[0].toCharArray()){
            for(int i=1;i<strs.length;i++){
                if(index>=strs[i].length()|| c!=strs[i].charAt(index)){
                    return ans;
                }
            }
            ans+=c;
            index++;
        }
        return ans;
    }
}
        