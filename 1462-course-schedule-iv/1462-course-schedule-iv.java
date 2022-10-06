class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
List<Boolean > res=new ArrayList<>();
        int mat[][]=new int[numCourses][numCourses];
        for(int[] a: mat){
        Arrays.fill(a,Integer.MAX_VALUE/2);
        }
        for(int [] pre: prerequisites){
            mat[pre[0]][pre[1]]=1;
        }
        int n=numCourses;
for(int k=0;k<n;k++){
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(mat[i][j]>mat[i][k]+mat[k][j]){
mat[i][j]=mat[i][k]+mat[k][j];
        }

}}
}
for(int i[]: queries){
    if(mat[i[0]][i[1]]!=Integer.MAX_VALUE/2){
        res.add(true);
    }
    else{
res.add(false);
    }
}
    return res;
    }}
