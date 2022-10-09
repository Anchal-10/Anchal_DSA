class pair{
    int id;
    int length;
    public pair(int id,int length){
        this.id=id;
        this.length=length;
    }
}
class Solution {
    public int hardestWorker(int n, int[][] logs) {
      if (logs.length == 0) return 0;

      int res = logs[0][0];                                              // Will track of Employee Id

      int maxTime = logs[0][1] - 0;                                     // MaxTime seen so far

      for (int i = 1; i < logs.length; i++) {

         int time = logs[i][1] - logs[i - 1][1];                       // Current Task time   

         if (maxTime == time) {
            res = res < logs[i][0] ? res : logs[i][0];
         } else if (maxTime < time) {
            maxTime = logs[i][1] - logs[i - 1][1];
            res = logs[i][0];
         }
      }

      return res;
   }
}
