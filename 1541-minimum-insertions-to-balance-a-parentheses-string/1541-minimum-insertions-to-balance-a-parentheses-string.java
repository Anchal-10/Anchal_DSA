class Solution {
    public int minInsertions(String s) {
int ans=0;
        int count=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
if(s.charAt(i)=='('){
    count+=2;
    if(count%2!=0){
        ans++;
        count--;
    }
}
            else{
count--;
            if(count<0){
                ans++;
                count+=2;
                
            }}
        }
        return ans+count;
    }
}