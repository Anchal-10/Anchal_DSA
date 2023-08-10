//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
StringBuilder sb= new StringBuilder();
int i= X.length()-1;
int j=Y.length()-1;
int carry=0;
while(i>=0 || j>=0 || carry>0){
    int sum=0;
    if(i>=0){
        sum=sum+ X.charAt(i)-'0';
        
    }
        if(j>=0){
        sum=sum+ Y.charAt(j)-'0';
        
    }
    
    sum=sum+carry;
    sb.append(sum%10);
    carry=sum/10;
    i--;
    j--;

}
String str=sb.reverse().toString();
int k=0;
while(k< str.length()-1 && str.charAt(k)=='0'){
    k++;
}

return str.substring(k);
}
}