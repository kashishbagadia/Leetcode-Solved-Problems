// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();            
            Solution ob = new Solution();
            int ans = ob.binary_to_decimal(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int binary_to_decimal(String str)
    {
        int n = str.length();
        char c;
        int sum=0,k=0;
        for(int i = n-1; i >= 0; i--){
            c = str.charAt(i);
            if(c=='1')
            sum += 1*Math.pow(2,k);
            else
            sum += 0*Math.pow(2,k);
            k++;
        }
        return sum;
    }
}