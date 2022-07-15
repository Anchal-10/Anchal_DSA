class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(encodedText.length()==0){
            return encodedText;
        }
        int col=encodedText.length()/rows;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<col;i++){
            for(int j=i;j<encodedText.length();j+=(col+1)){
                sb.append(encodedText.charAt(j));
                
            }
                
        }
        String res=sb.toString();
        int j=res.length()-1;
        while(res.charAt(j)==' '){
            j--;
        }
        return res.substring(0,j+1);
    }
}
