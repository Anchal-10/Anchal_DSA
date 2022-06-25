class Solution {
            ArrayList<Integer> al=new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {
for(int i=1;i<=9;i++){
dfs(i,n);
}
    return al;

    }
     public void dfs(int curr,int n){
if(curr>n){
return;
}
         al.add(curr);
         for(int i=0;i<=9;i++){
               dfs(curr*10+i,n);
         }
     
     }
    }