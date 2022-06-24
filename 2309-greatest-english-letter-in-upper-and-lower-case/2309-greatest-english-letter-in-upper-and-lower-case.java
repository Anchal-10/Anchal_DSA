class Solution {
    public String greatestLetter(String s) {
        String v="";
HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
           set.add(s.charAt(i));
        }
        for(char ch='Z'; ch>='A';ch--){
            if(set.contains(ch)&& set.contains(Character.toLowerCase(ch))){
                v=v+ch;
                return v;
            }
        }
        return "";
    }
}
        