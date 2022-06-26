class Solution {
    public String capitalizeTitle(String title) {
String arr[]=title.split(" ");
        String curr="";
        StringBuilder res=new StringBuilder();
        for(String s: arr){
if(s.length()>2){
    String first=s.substring(0,1);
    String second=s.substring(1,s.length());
    curr=first.toUpperCase()+second.toLowerCase();
}
            else{
                
                curr=s.toLowerCase();
            }
            
            res.append(curr+ " ");
        }
        return res.toString().trim();
        }
}