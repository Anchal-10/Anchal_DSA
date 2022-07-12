// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; ++i)
                arr[i] = sc.nextInt ();

    		System.out.println (new Sol().closestToZero (arr, n));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static int closestToZero (int arr[], int n)
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int sum=0;
        int i=0;
        int j=n-1;
        int ans=0;
        while(i<j){
            sum=arr[i]+arr[j];
            if(Math.abs(sum)<Math.abs(min)){
                ans=sum;
                min=sum;
            }
                        if(Math.abs(sum)==Math.abs(min)){
         min=Math.max(sum,min);                   
}
            

            if(sum<0){
                i++;
            }
            else{
                j--;
            }
        }
        return min;
    }
}