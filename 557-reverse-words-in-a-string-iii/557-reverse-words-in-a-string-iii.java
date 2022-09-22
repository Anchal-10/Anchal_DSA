class Solution {
    public String reverseWords(String s) {
        
		String[] st=s.split("\\s");
        			String v="";

		for(int i=0;i<st.length;i++) {
			for(int j=st[i].length()-1;j>=0;j--) {
				v=v+st[i].charAt(j);
			}
           v= v+" ";
        }
        v=v.trim();
            return v;

        
        
        
        
        
    }
}