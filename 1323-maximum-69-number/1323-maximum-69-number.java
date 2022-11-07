class Solution {
    public int maximum69Number (int num) {
        
    String ans=String.valueOf(num);
    char []ch=ans.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='6'){
                ch[i]='9';
                break;
            }
        }
      String s=  String.valueOf(ch);
        return Integer.parseInt(s);
    }
}
