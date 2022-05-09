class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0|| digits.isEmpty()){
            return ans;
        }
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
 backtrack(digits,0,new StringBuilder(),map,ans);
        return ans;
    }
    public void backtrack(String digits,int i,StringBuilder sb,HashMap<Character,String> map,List<String> ans){
        if(i>=digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr=map.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
             backtrack(digits,i+1,sb,map,ans);
            sb.deleteCharAt(sb.length()-1);

        }
    }
}