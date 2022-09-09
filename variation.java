/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    long[] arr= new long[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int val=0;
	    int i=0;
	    int j=0;
	    while(i<n&&j<n){
	        if(arr[j]-arr[i]>=k)
	        {
	           val+=(n-j);
	           i++;
	        }
	        else
	        j++;
	    }
	    System.out.println(val);
		// your code goes here
	}
}
