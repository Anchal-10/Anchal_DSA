//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
       int i=0;
       while(i<array.length){
          int correct_pos = array[i]-1;
          
          if((correct_pos<=array.length-1 && correct_pos>=0 )&& (array[i]!= array[correct_pos])){
              swap(array, i, correct_pos);
          }
          else{
              i++;
          }
       }
       for(int j=0;j<array.length;j++){
           if(array[j]!=j+1){
               return j+1;
           }
       }
       return array.length+1;
    }
    public void swap(int []array, int a, int b){
        int temp= array[a];
        array[a]=array[b];
        array[b]=temp;
    }
}

    
