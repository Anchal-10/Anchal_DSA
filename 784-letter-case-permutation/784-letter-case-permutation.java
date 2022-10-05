class Solution {
    public List<String> letterCasePermutation(String s) {
List<String> res=new ArrayList<>();
        helper(res,s.toCharArray(),0);
        return res;
    }
    public void helper(List<String> res,char []ch,int ind){
        if(ind==ch.length){
            res.add(new String(ch));
            return;
        }
        if(Character.isLetter(ch[ind])){
            ch[ind]=Character.toLowerCase(ch[ind]);
            helper(res,ch,ind+1);
                        ch[ind]=Character.toUpperCase(ch[ind]);
            helper(res,ch,ind+1);

        }
        else{
                        helper(res,ch,ind+1);

        }
    }
}