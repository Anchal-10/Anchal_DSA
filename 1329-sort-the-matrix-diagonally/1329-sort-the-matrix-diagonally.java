class Solution {
    public int[][] diagonalSort(int[][] mat) {
int m=mat.length;
int n=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int diagonal_id=i-j;
                if(!map.containsKey(diagonal_id)){
                    PriorityQueue<Integer> pq=new PriorityQueue<>();
                    pq.add(mat[i][j]);
                    map.put(diagonal_id,pq);
                }
                else{
                    PriorityQueue<Integer> pq=map.get(diagonal_id);
                    pq.add(mat[i][j]);
                    map.put(diagonal_id,pq);
                }
            }
        }
        System.out.print(map);
        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
                   int diagonal_id=i-j;
                   PriorityQueue<Integer> pq=map.get(diagonal_id);
                    mat[i][j]=pq.poll();
  

        }
        }
        return mat;
    }
}

        








