class Solution {
    public String reverseVowels(String s) {
        String vowels="";
        for(int i=0;i<s.length();i++){
char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'){
                vowels=ch+vowels;
            }
        }
        char ch[]=s.toCharArray();
        int j=0;
                for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                ch[i]=vowels.charAt(j);
                j++;
            }
                }
    return String.valueOf(ch);
    }
        }

                
