class Solution {
    public int edgeScore(int[] edges) {
        int n= edges.length;
        
        
        // score array
        long[] ans= new long[n];
        
        // variable to store max score
        long maxx= -1;
        
        //calcualting the score of each node and keeping a check of the max. score
        for( int i=0; i<n; i++){
            ans[edges[i]]=ans[edges[i]]+i;
            maxx= Math.max(maxx, ans[edges[i]]);
        }
        
        
        // search the node with the max score
         for( int i=0; i<n; i++){
            if( ans[i]==maxx)return i;
        }
        
        //just to stope the compiler from throwing "missing return statement error"
        return -1;
        
    }
}
//ṁ TIme Complexity= O(n)
