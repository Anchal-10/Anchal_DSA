class Solution {
    public boolean halvesAreAlike(String s) {
 int i=0;
        int d=0;
        int c=0;
        for(i=0;i<s.length()/2;i++){
if(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ||s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
    d++;
}
        }
        while(i<s.length()){
            
            if(s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U' ||s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ){
    c++;
}
        i++;

            
            
            
        }
    return d==c;
    }
}