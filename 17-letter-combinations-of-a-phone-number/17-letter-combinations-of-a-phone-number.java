class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
                if(digits.length()==0|| digits.isEmpty()){
            return list;
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
        solve(list,0,digits,map,new StringBuilder());
        return list;
        
    }
    public void solve(List<String> res,int ind,String digits,HashMap<Character,String> map,StringBuilder sb){
        if(ind>=digits.length()){
            res.add(sb.toString());
            return;
        }
        
        
        
        String m=map.get(digits.charAt(ind));
        for(int i=0;i<m.length();i++){
            sb.append(m.charAt(i));
            solve(res,ind+1,digits,map,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}